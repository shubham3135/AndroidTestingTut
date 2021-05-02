
package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task

/**
 * Function that does some trivial computation. Used to showcase unit tests.
 */
internal fun getActiveAndCompletedStats(tasks: List<Task>?): StatsResult {

    return if (tasks==null || tasks.isEmpty()){
        StatsResult(
            activeTasksPercent = 0f,
            completedTasksPercent = 0f
        )
    }else {
        val totalTasks = tasks.size
        val numberOfActiveTasks = tasks.count { it.isActive }
        StatsResult(
            activeTasksPercent = 100f * numberOfActiveTasks / totalTasks,
            completedTasksPercent = 100f * (totalTasks - numberOfActiveTasks) / totalTasks
        )
    }
}

data class StatsResult(val activeTasksPercent: Float, val completedTasksPercent: Float)
