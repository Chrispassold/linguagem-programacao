package com.chrispassold.ShoppingList.model.wrapper

import com.chrispassold.ShoppingList.model.entity.TodoItem
import com.fasterxml.jackson.annotation.JsonProperty

class TodoItemWrapper(model: TodoItem) : AbstractModelWrapper(model) {
    @JsonProperty("name")
    val name: String? = model.name

    @JsonProperty("checked")
    var checked: Boolean = model.checked

    @JsonProperty("todoList")
    val todoList: TodoListWrapper? = model.todoList!!.run {
        TodoListWrapper(this)
    }
}