package com.example.nlctodoliist.modal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.nlctodoliist.modal.dao.TaskDao
import com.example.nlctodoliist.modal.data.Task

@Database(
    entities = [Task::class] ,version = 1
)
abstract class TaskDatabase : RoomDatabase()
{

    abstract fun TaskDao(): TaskDao

    companion object {
        @Volatile private var instance: TaskDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            TaskDatabase::class.java, "todo-list.db")
            .build()
    }

}