# Todo App

## Introduction
The Todo App helps users organize and manage their tasks efficiently. It provides a user-friendly interface for adding, viewing, and deleting todo items. The application utilizes modern Android development practices, including the use of RecyclerView for displaying todo items and Room Persistence Library for managing local database operations.

## Features
- **Add Tasks:** Users can add new todo items to their list by entering the task description and clicking the "Add Todo" button.
- **View Todo List:** The application displays all todo items in a RecyclerView, allowing users to scroll through their list effortlessly.
- **Delete Tasks:** Users can delete a todo item by tapping on the delete button associated with each task.
- **Persistence:** Todo items are stored locally using Room Database, ensuring that users' tasks are saved even if they close the application.

## Tech Stack
- **RecyclerView and Adapter:** Efficiently displays todo items in a list format.
- **Room Database:** Stores todo items locally, ensuring data persistence.
- **Repository Pattern:** Acts as an intermediary between the ViewModel and the Room Database.
- **ViewModel:** Manages UI-related data for the MainActivity.

## Installation
To run the Todo App locally, follow these steps:
1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the project on an emulator or physical device.

## Usage
1. Launch the Todo App on your Android device.
2. Add new tasks by entering the task description and clicking the "Add Todo" button.
3. View your todo list and scroll through the tasks.
4. Delete tasks by tapping on the delete button next to each task.

