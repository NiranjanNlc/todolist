package com.example.nlctodoliist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nlctodoliist.R
import com.example.nlctodoliist.databinding.ActivityTaskListBinding

private lateinit var binding :  ActivityTaskListBinding
class TaskListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}