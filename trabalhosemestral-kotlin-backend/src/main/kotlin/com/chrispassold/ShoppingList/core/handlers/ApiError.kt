package com.chrispassold.ShoppingList.core.handlers

import org.springframework.http.HttpStatus
import java.time.LocalDateTime
import com.fasterxml.jackson.annotation.JsonFormat

//https://www.toptal.com/java/spring-boot-rest-api-error-handling
internal class ApiError private constructor() {

    var status: HttpStatus? = null
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    val timestamp: LocalDateTime = LocalDateTime.now()
    var message: String? = null
    var debugMessage: String? = null

    constructor(status: HttpStatus) : this() {
        this.status = status
    }

    constructor(status: HttpStatus, ex: Throwable) : this() {
        this.status = status
        this.message = "Unexpected error"
        this.debugMessage = ex.localizedMessage
    }

    constructor(status: HttpStatus, message: String, ex: Throwable) : this() {
        this.status = status
        this.message = message
        this.debugMessage = ex.localizedMessage
    }
}