package com.example.todo_mytry
// MainActivityData.kt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todo_mytry.database.entities.Todo

class MainActivityData : ViewModel() {
    private val _data = MutableLiveData<List<Todo>>()
    val data: LiveData<List<Todo>> = _data

    fun setData(data: List<Todo>) {
        _data.value = data
    }
}
