package org.example.behaviorial.command.buttonTaskManagerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TaskManager {

    private List<Task> tasks;

    private Stack<Task> history;

    public Stack<Task> getHistory() {
        return history;
    }

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}
