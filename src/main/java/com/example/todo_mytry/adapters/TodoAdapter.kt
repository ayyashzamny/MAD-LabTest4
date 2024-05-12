package com.example.todo_mytry.adapters
// TodoAdapter.kt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_mytry.R
import com.example.todo_mytry.database.entities.Todo

class TodoAdapter(var items: List<Todo>, private val onItemClick: (Int) -> Unit) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val currentItem = items[position]
        holder.cbTodo.text = currentItem.item
        holder.cbTodo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                onItemClick(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cbTodo: CheckBox = itemView.findViewById(R.id.cbTodo)
    }
}
