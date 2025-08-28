package com.sebastian.model;

/**
 * Class to model our data, it's a task with a name, a description and knows whether it's finished. 
 */
public class TaskModel {
    private String name;
    private String desc; 
    private boolean completed = false; //initialized false. 

    public TaskModel(String name, String desc) {
        this.name = name;
        this.desc = desc;
    } 
    
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeTask(){
        completed = true; 
    }




    
}
