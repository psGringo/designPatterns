package org.example.behaviorial.command.buttonTaskManagerExample;

public class UiEmulation {

    private TaskManager taskManager;

    public UiEmulation() {
        taskManager = new TaskManager();
    }

    public AddTaskButton addTaskButton() {
        var task = new Task("anotherTask");
        var command = new AddTaskCommand(taskManager, task);
        return new AddTaskButton(command);
    }

}
