package com.chrispassold.ShoppingList.core.handlers

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.security.InvalidParameterException
import javax.persistence.EntityNotFoundException


@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
class RestExceptionHandler : ResponseEntityExceptionHandler() {

    private fun buildResponseEntity(apiError: ApiError): ResponseEntity<Any> {
        return ResponseEntity(apiError, apiError.status!!)
    }

    @ExceptionHandler(InvalidParameterException::class)
    protected fun handleInvalidParameter(ex: InvalidParameterException): ResponseEntity<Any> {
        val apiError = ApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex.message!!, ex)
        return buildResponseEntity(apiError)
    }

    @ExceptionHandler(EntityNotFoundException::class)
    protected fun handleEntityNotFound(ex: EntityNotFoundException): ResponseEntity<Any> {
        val apiError = ApiError(HttpStatus.NOT_FOUND, ex.message!!, ex)
        return buildResponseEntity(apiError)
    }
}