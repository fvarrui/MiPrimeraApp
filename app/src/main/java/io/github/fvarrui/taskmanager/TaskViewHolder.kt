package io.github.fvarrui.taskmanager

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val taskText: TextView = view.findViewById(R.id.taskText)

    fun render(task: String) {
        taskText.text = task
    }

}