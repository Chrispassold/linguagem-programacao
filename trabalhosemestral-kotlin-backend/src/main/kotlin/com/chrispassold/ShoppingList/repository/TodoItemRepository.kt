package com.chrispassold.ShoppingList.repository

import com.chrispassold.ShoppingList.model.entity.TodoItem
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface TodoItemRepository : CrudRepository<TodoItem, Long>