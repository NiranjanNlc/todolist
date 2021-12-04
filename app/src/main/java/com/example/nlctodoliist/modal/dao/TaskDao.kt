package com.example.nlctodoliist.modal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.nlctodoliist.modal.data.Task

@Dao
interface TaskDao
{
    @Insert
    fun insert(note: Task)

    @Update
    fun update(note: Task)

    @Delete
    fun delete(note: Task)

    @Query("delete from task_table")
    fun deleteAllTasks()

    @Query("select * from task_table  order by id  desc")
    fun getAllTasks(): LiveData<List<Task>>
}