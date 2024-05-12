package com.example.todo_mytry.database.repositories

import com.example.todo_mytry.database.daos.TodoDao
import com.example.todo_mytry.database.entities.Todo

// TodoRepository.kt

class TodoRepository(private val todoDao: TodoDao) {
    suspend fun insert(todo: Todo) {
        todoDao.insert(todo)
    }

    suspend fun delete(todo: Todo) {
        todoDao.delete(todo)
    }

    suspend fun getAllTodoItems(): List<Todo> {
        return todoDao.getAllTodoItems()
    }
}
