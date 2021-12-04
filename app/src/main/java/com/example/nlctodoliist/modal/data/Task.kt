package com.example.nlctodoliist.modal.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "task_table")
data class Task(var title : String,
                val description: String,
                val status: Boolean,
                val deadline : Date,
                @PrimaryKey(autoGenerate = true)
                 val id: Int
)