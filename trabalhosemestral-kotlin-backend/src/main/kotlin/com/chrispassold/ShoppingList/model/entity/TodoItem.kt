package com.chrispassold.ShoppingList.model.entity

import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = TodoItem.TABLE_NAME)
data class TodoItem(
        @NotNull
        @Column(name = COL_NAME)
        var name: String,

        @NotNull
        @Column(name = COL_CHECKED)
        var checked: Boolean = false,

        @ManyToOne(targetEntity = TodoList::class, fetch = FetchType.LAZY)
        @JoinColumn(name = COL_TODOLIST)
        var todoList: TodoList? = null
) : AbstractModel() {

    companion object {
        const val TABLE_NAME = "todo_item"
        const val COL_NAME = "name"
        const val COL_CHECKED = "checked"
        const val COL_TODOLIST = "todo_list_id"
    }

    constructor(name: String, checked: Boolean) : this(name, checked, null)
}