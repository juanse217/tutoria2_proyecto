package com.sebastian.controller;

import java.util.ArrayList;
import java.util.List;

import com.sebastian.model.TaskModel;
import com.sebastian.view.TaskView;

/**
 * the controller of our system.
 */
public class TaskController {
    private List<TaskModel> tasks = new ArrayList<>();
    private TaskView viewer = new TaskView();

    public void addTask(TaskModel task) {
        tasks.add(task);
        System.out.println("Task added succesfully");
    }

    public void showTasks() {
        viewer.showTasks(tasks);
    }

    public void completeTask(int index) {
        index--; 
        if (index >= 0 && index <= tasks.size()) {
            tasks.get(index).completeTask();
            System.out.println("Task " + tasks.get(index).getName() + " completed");
        }else{
            System.out.println("The task couldn't be marked as completed");
        }

    }

    public void removeTask(int index) {
        index--;
        if (index >= 0 && index <= tasks.size()) {
            tasks.remove(index);
            System.out.println("Task " + tasks.get(index).getName() + " removed");
        } else {
            System.out.println("Task couldn't be removed");
        }

    }

}
