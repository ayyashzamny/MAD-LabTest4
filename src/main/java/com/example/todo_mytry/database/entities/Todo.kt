package com.example.todo_mytry.database.entities
// Todo.kt

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    var item: String?
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
