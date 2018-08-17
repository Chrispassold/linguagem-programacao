package com.chrispassold.ShoppingList.model.wrapper

import com.chrispassold.ShoppingList.model.entity.AbstractModel
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

abstract class AbstractModelWrapper(model: AbstractModel) : AbstractWrapper() {
    @JsonProperty("id")
    val id: Long? = model.id

    @JsonProperty("createdAt")
    var createdAt: Date? = model.createdAt

    @JsonProperty("updatedAt")
    var updatedAt: Date? = model.updatedAt

    fun isNew() : Boolean {
        return id == null
    }
}