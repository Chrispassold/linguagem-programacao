package com.chrispassold.ShoppingList.model.wrapper

import com.chrispassold.ShoppingList.model.entity.TodoList
import com.fasterxml.jackson.annotation.JsonProperty

class TodoListWrapper(model: TodoList) : AbstractModelWrapper(model) {
    @JsonProperty("name")
    val name: String = model.name

    @JsonProperty("percent")
    val percent: Int = model.getPercentCompleted()
}