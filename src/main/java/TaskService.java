// Nichoals Agosto
// 5.29.25
// CS 320

import java.util.HashMap;

class TaskService{
    
    HashMap<String, Task> tasks = new HashMap<>();

    public void addTask(Task task){
        if(tasks.containsKey(task.getTaskID())){
            throw new IllegalArgumentException("Task ID already exists");
        }
        tasks.put(task.getTaskID(), task);
    }

     public void deleteTask(String taskID) {
        if (!tasks.containsKey(taskID)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        tasks.remove(taskID);
    }

    public Task getTask(String taskID) {
    if (!tasks.containsKey(taskID)) {
        throw new IllegalArgumentException("Task ID not found.");
    }
    return tasks.get(taskID);
}
    
    public void updateTaskName(String taskID, String newName){
        Task task = tasks.get(taskID);
        if (task == null){
            throw new IllegalArgumentException("Task ID not found");
        }
        task.setName(newName);
    }
    
    public void updateTaskDescription(String taskID, String newDescription){
        Task task = tasks.get(taskID);
        if (task == null){
            throw new IllegalArgumentException("Task ID not found");
        }
        task.setDescription(newDescription);
    }

}