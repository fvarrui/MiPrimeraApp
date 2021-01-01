package io.github.fvarrui.taskmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var taskText: TextView
    lateinit var addTaskButton: Button
    lateinit var tasksList: RecyclerView

    lateinit var adapter: TaskAdapter

    var tasks = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {
        initView()
        initListeners()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        tasksList.layoutManager = LinearLayoutManager(this)
        adapter = TaskAdapter(tasks)
        tasksList.adapter = adapter
    }

    private fun initListeners() {
        addTaskButton.setOnClickListener {
            addTask()
        }
    }

    private fun addTask() {
        val newTask = taskText.text.toString()
        tasks.add(newTask)
        adapter.notifyDataSetChanged()
        taskText.setText("")
    }

    private fun initView() {
        taskText = findViewById(R.id.taskText)
        addTaskButton = findViewById(R.id.addTaskButton)
        tasksList = findViewById(R.id.tasksList)
    }

}