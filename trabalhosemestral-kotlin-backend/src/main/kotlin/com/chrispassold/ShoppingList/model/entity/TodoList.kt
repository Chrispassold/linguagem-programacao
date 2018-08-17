package com.chrispassold.ShoppingList.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = TodoList.TABLE_NAME)
data class TodoList(
        @NotBlank
        @Column(name = COL_NAME)
        var name: String
) : AbstractModel() {
    @OneToMany(fetch = FetchType.LAZY, targetEntity = TodoItem::class, mappedBy = "todoList", cascade = [CascadeType.ALL])
    @JsonIgnore
    var todoItems: Set<TodoItem> = mutableSetOf()

    fun getPercentCompleted(): Int {
        if (todoItems.isEmpty()) return 0

        val filter: List<TodoItem> = todoItems.asIterable().filter { todoItem -> todoItem.checked }

        return (100 * filter.size) / todoItems.size
    }

    companion object {
        const val TABLE_NAME = "todo_list"
        const val COL_NAME = "name"
    }
}