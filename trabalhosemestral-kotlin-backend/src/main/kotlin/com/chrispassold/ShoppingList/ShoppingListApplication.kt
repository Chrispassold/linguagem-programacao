package com.chrispassold.ShoppingList

import com.chrispassold.ShoppingList.model.entity.TodoItem
import com.chrispassold.ShoppingList.model.entity.TodoList
import com.chrispassold.ShoppingList.repository.TodoItemRepository
import com.chrispassold.ShoppingList.repository.TodoListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.util.*
import javax.annotation.PostConstruct


@SpringBootApplication
@EnableJpaAuditing
class ShoppingListApplication {
    @Bean
    fun init(@Autowired todoListRepository: TodoListRepository, @Autowired todoItemRepository: TodoItemRepository) = CommandLineRunner {
//        val todoList = todoListRepository.save(TodoList(name = "List um"))
//
//        todoItemRepository.save(TodoItem("item 1", false, todoList))
//        todoItemRepository.save(TodoItem("item 2", true, todoList))
//        todoItemRepository.save(TodoItem("item 3", true, todoList))
//        todoItemRepository.save(TodoItem("item 4", true, todoList))

    }
}

@PostConstruct
fun started() {
    TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"))
}

fun main(args: Array<String>) {
    runApplication<ShoppingListApplication>(*args)
}
