package com.example.todo

import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao, private val apiService: ApiService) {

    val allTasks: Flow<List<Task>> = taskDao.getAllTasks()

    suspend fun insert(task: Task) {
        taskDao.insertTask(task)
    }

    suspend fun update(task: Task) {
        taskDao.updateTask(task)
    }

    suspend fun delete(task: Task) {
        taskDao.deleteTask(task)
    }

    fun searchTasks(query: String): Flow<List<Task>> {
        return taskDao.searchTasks("%$query%")
    }

    suspend fun fetchTasksFromApi(): List<Task> {
        return apiService.getPosts().map {
            Task(title = it.title, isCompleted = false)
        }
    }
}