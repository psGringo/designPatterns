package org.example.behaviorial.command.buttonTaskManagerExample;

public class AddTaskButton {

    private Command command;

    public AddTaskButton(Command command) {
        this.command = command;
    }

    public void onClick() {
        command.execute();
    }
}
