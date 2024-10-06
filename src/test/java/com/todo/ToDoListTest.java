
package com.todo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ToDoListTest {

    @Test
    public void testAddTask() {
        ToDoList list = new ToDoList();
        list.addTask("Test Task");
        assertEquals(1, list.getTasks().size());
        assertEquals("Test Task", list.getTasks().get(0).getTitle());
    }

    @Test
    public void testRemoveTask() {
        ToDoList list = new ToDoList();
        list.addTask("Test Task");
        list.removeTask(0);
        assertEquals(0, list.getTasks().size());
    }

    @Test
    public void testMarkTaskComplete() {
        ToDoList list = new ToDoList();
        list.addTask("Test Task");
        list.markTaskComplete(0);
        assertTrue(list.getTasks().get(0).isCompleted());
    }
}
