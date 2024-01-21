package org.example.behaviorial.command.buttonTaskManagerExample;

public class CommandDemo {
    public static void execute() {
        UiEmulation uiEmulation = new UiEmulation();
        var taskButton = uiEmulation.addTaskButton();
        taskButton.onClick();
    }
}
