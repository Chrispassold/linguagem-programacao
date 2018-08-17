package com.chrispassold.ShoppingList.controller

import com.chrispassold.ShoppingList.model.entity.TodoList
import com.chrispassold.ShoppingList.model.wrapper.TodoListWrapper
import com.chrispassold.ShoppingList.repository.TodoListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.security.InvalidParameterException
import javax.persistence.EntityNotFoundException

@RestController
class TodoListController(@Autowired val repository: TodoListRepository) : AbstractController() {

    @GetMapping("/todo/lists")
    fun getAll(): List<TodoListWrapper> {
        return repository.findAll().sortedByDescending { it.createdAt }.map { todoList: TodoList -> TodoListWrapper(todoList) }
    }

    @GetMapping("/todo/list/{id}")
    fun getById(@PathVariable("id") id: Long): ResponseEntity<TodoListWrapper> {
        val todoListOptional = repository.findById(id)

        if (!todoListOptional.isPresent) {
            throw EntityNotFoundException("Todo list not found")
        }

        return ResponseEntity(TodoListWrapper(todoListOptional.get()), HttpStatus.OK)
    }

    @PostMapping("/todo/list")
    fun insert(@RequestBody body: TodoListWrapper): ResponseEntity<TodoList> {
        val todoList = TodoList(body.name)
        val saved = repository.save(todoList)

        return ResponseEntity(saved, HttpStatus.OK)
    }

    @PutMapping("/todo/list/{id}")
    fun update(@PathVariable("id") id: Long, @RequestBody body: TodoListWrapper): ResponseEntity<TodoList> {
        val todoList: TodoList = repository.findById(id).orElseThrow { InvalidParameterException("Todo list não encontrada") }
        todoList.name = body.name

        val saved = repository.save(todoList)

        return ResponseEntity(saved, HttpStatus.OK)
    }


    @DeleteMapping("/todo/list/{id}")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<TodoList> {
        repository.deleteById(id)
        return ResponseEntity(HttpStatus.OK)
    }
}