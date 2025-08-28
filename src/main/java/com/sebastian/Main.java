package com.sebastian;

import com.sebastian.controller.TaskController;
import com.sebastian.model.TaskModel;

public class Main {
    public static void main(String[] args) {
        TaskController controller = new TaskController(); 

        controller.addTask(new TaskModel("Study java", "Study how to work with arrays"));

        controller.addTask(new TaskModel("Study Spring Boot", "Study how to work with DB"));

        controller.addTask(new TaskModel("Walk the dog", "Walk the dog"));

        controller.showTasks();

        controller.completeTask(1);
        controller.completeTask(2);
        
        controller.showTasks();
    }
}