package com.chrispassold.ShoppingList.controller

import com.chrispassold.ShoppingList.model.entity.TodoItem
import com.chrispassold.ShoppingList.model.entity.TodoList
import com.chrispassold.ShoppingList.model.wrapper.TodoItemWrapper
import com.chrispassold.ShoppingList.repository.TodoItemRepository
import com.chrispassold.ShoppingList.repository.TodoListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.security.InvalidParameterException
import java.util.*
import javax.persistence.EntityNotFoundException


@RestController
class TodoItemController(@Autowired val repository: TodoItemRepository, @Autowired val repositoryTodoList: TodoListRepository) : AbstractController() {

    private fun getTodoListById(idTodoList: Long): Optional<TodoList> {
        return repositoryTodoList.findById(idTodoList)
    }

    @GetMapping("/todo/{id}/items")
    fun getAll(@PathVariable("id") idTodoList: Long): List<TodoItemWrapper> {
        val todoListOptional: Optional<TodoList> = getTodoListById(idTodoList)

        if (!todoListOptional.isPresent) {
            throw EntityNotFoundException("Todo list not found")
        }

        return repository.findAll()
                .asIterable()
                .filterNotNull()
                .filter { todoItem: TodoItem -> todoItem.todoList?.id == idTodoList }
                .map { todoItem: TodoItem? -> TodoItemWrapper(todoItem!!) }
    }

    @PostMapping("/todo/item")
    fun insert(@RequestBody newItem: TodoItemWrapper): ResponseEntity<TodoItemWrapper> {
        if (newItem.name == null || newItem.name.isNullOrBlank()) {
            throw InvalidParameterException("Name cannot be null")
        }

        val todoListOptional: Optional<TodoList> = newItem.todoList?.run {
            repositoryTodoList.findById(this.id!!)
        } ?: throw EntityNotFoundException("Todo list not found")

        val todoItem = repository.save(TodoItem(newItem.name, newItem.checked, todoListOptional.get()))

        return ResponseEntity(TodoItemWrapper(todoItem), HttpStatus.OK)
    }

    @DeleteMapping("/todo/item/{id}")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<TodoItem> {
        repository.deleteById(id)
        return ResponseEntity(HttpStatus.OK)
    }

    @PutMapping("/todo/item/{id}/toggle")
    fun toggle(@PathVariable("id") id: Long): ResponseEntity<TodoItemWrapper> {
        val todoItemOptional: Optional<TodoItem> = repository.findById(id)

        if (!todoItemOptional.isPresent) {
            throw EntityNotFoundException("Todo item not found")
        }

        val todoItem: TodoItem = todoItemOptional.get()

        todoItem.checked = !todoItem.checked

        repository.save(todoItem)
        return ResponseEntity(HttpStatus.OK)
    }
}