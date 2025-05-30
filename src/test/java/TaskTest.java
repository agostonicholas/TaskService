// Nichoals Agosto
// 5.29.25
// CS 320


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    void testConstructorSetsFieldsCorrectly() {
        Task task = new Task("Test Task", "Test description");

        assertEquals(task.getTaskID(), task.getTaskID());
        assertEquals("Test Task", task.getName());
        assertEquals("Test description", task.getDescription());
    }

    @Test
    void testConstructorRejectsNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Valid");
        });

        assertEquals("Name cannot be null or more than 20 characters", exception.getMessage());
    }

    @Test
    void testConstructorRejectsLongDescription() {
        String longDescription = "x".repeat(51); // 51 characters
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task("Valid", longDescription);
        });

        assertEquals("Description cannot be null or more than 50 characters", exception.getMessage());
    }

    @Test
    void testSetNameWorks() {
        Task task = new Task("Old Name", "Some desc");
        task.setName("New Name");

        assertEquals("New Name", task.getName());
    }

    @Test
    void testSetDescriptionWorks() {
        Task task = new Task("Task", "Old Desc");
        task.setDescription("New Desc");

        assertEquals("New Desc", task.getDescription());
    }

    @Test
    void testRandomIDGenerationWhenNull() {
        Task task = new Task("Name", "Desc");

        assertNotNull(task.getTaskID());
        assertEquals(10, task.getTaskID().length());
    }
}