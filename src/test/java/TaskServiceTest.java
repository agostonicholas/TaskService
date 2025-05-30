// Nichoals Agosto
// 5.29.25
// CS 320

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest{

    @Test
    void testAddTaskSuccessfully(){
        TaskService service = new TaskService();
        Task task = new Task("Test Task", "testing task description");
        
        service.addTask(task);

        assertEquals("Test Task", service.getTask((task.getTaskID())).getName());
    }

    @Test
    void testDeleteTaskSuccessfully() {
        TaskService service = new TaskService();
        Task task = new Task("Delete Me", "To be removed");

        service.addTask(task);
        service.deleteTask(task.getTaskID());

        assertThrows(IllegalArgumentException.class, () -> {
            service.getTask(task.getTaskID());
        });
    }

    @Test
    void testUpdateTaskName() {
        TaskService service = new TaskService();
        Task task = new Task("Old Name", "Still good desc");

        service.addTask(task);
        service.updateTaskName(task.getTaskID(), "New Name");

        assertEquals("New Name", service.getTask(task.getTaskID()).getName());
    }

    @Test
    void testUpdateTaskDescription() {
        TaskService service = new TaskService();
        Task task = new Task("Same Name", "Old Description");

        service.addTask(task);
        service.updateTaskDescription(task.getTaskID(), "Updated Description");

        assertEquals("Updated Description", service.getTask(task.getTaskID()).getDescription());
    }
}
