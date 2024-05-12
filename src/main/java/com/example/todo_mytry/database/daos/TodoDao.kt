package com.example.todo_mytry.database.daos
// TodoDao.kt

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todo_mytry.database.entities.Todo

@Dao
interface TodoDao {
    @Insert
    suspend fun insert(todo: Todo)

    @Delete
    suspend fun delete(todo: Todo)

    @Query("SELECT * FROM Todo")
    suspend fun getAllTodoItems(): List<Todo>
}
