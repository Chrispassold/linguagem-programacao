package com.chrispassold.ShoppingList.repository

import com.chrispassold.ShoppingList.model.entity.TodoList
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface TodoListRepository : CrudRepository<TodoList, Long> {
    fun deleteCascadeById(id: Long) {
        val optinal = findById(id)
        if (!optinal.isPresent) {
            return
        }
        val toDelete = optinal.get()

        for (todoItem in toDelete.todoItems!!.asIterable()) {
            todoItem.todoList = null
        }
        //TODO: CONTINUE TO DELETE
    }
}