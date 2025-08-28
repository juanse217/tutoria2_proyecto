package com.sebastian.view;

import java.util.List;
import com.sebastian.model.TaskModel;

/**
 * The viewer of the system
 */
public class TaskView {
    public void showTasks(List<TaskModel> tasks){
        System.out.println("--- Tasks List ---");
        int aux = 1; 
        for (TaskModel task : tasks) {
            String status = task.isCompleted() ? "(x)" : "( )";
            System.out.printf("%d. %s Name: %s Description: %s\n", aux++, status, task.getName(), task.getDesc());
        }
    }
    
}
