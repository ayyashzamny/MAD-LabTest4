package com.example.todo_mytry

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_mytry.adapters.TodoAdapter
import com.example.todo_mytry.database.TodoDatabase
import com.example.todo_mytry.database.repositories.TodoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityData
    private lateinit var adapter: TodoAdapter
    private lateinit var repository: TodoRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repository = TodoRepository(TodoDatabase.getInstance(this).todoDao())
        viewModel = ViewModelProvider(this)[MainActivityData::class.java]

        setupRecyclerView()
        setupAddButton()
    }

    private fun setupRecyclerView() {
        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Initialize adapter
        adapter = TodoAdapter(emptyList()) { position ->
            val todo = adapter.items[position]
            CoroutineScope(Dispatchers.IO).launch {
                repository.delete(todo)
                val data = repository.getAllTodoItems()
                viewModel.setData(data)
            }
        }

        // Set adapter
        recyclerView.adapter = adapter

        // Set layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.data.observe(this) { todos ->
            adapter.items = todos
            adapter.notifyDataSetChanged()
        }

        CoroutineScope(Dispatchers.IO).launch {
            val data = repository.getAllTodoItems()
            viewModel.setData(data)
        }
    }

    private fun setupAddButton() {
        val btnAddItem: Button = findViewById(R.id.btnAddTodo)
        btnAddItem.setOnClickListener {
            displayDialog(repository)
        }
    }

    private fun displayDialog(repository: TodoRepository) {
        // Dialog implementation
        // You can refer to the provided AlertDialog code in the previous responses
    }
}
