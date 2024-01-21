package org.example.behaviorial.command.buttonTaskManagerExample;

public class AddTaskCommand implements Command {

    private Task task;

    private TaskManager taskManager;

    public AddTaskCommand(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    public void execute() {
        taskManager.addTask(task);
        taskManager.getHistory().add(task);
        System.out.printf("added command task %s%n", task.getName());
    }
}
