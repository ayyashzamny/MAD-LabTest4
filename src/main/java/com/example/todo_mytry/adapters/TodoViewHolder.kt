package com.example.todo_mytry.adapters

// TodoViewHolder.kt

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_mytry.R

class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cbTodo: CheckBox = itemView.findViewById(R.id.cbTodo)
}
