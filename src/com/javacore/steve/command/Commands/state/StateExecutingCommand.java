package com.javacore.steve.command.Commands.state;

import com.javacore.steve.command.Commands.Application;
import com.javacore.steve.command.Commands.Commands.CommandRegistry;

public class StateExecutingCommand extends ApplicationState {

    @Override
    public void enter(String commandName) {
        System.out.println();
        CommandRegistry.INSTANCE.getCommand(commandName).execute();
        executeCommand(commandName);
    }

    private void executeCommand(String commandName) {
        CommandRegistry.INSTANCE.getCommand(commandName).execute();
        Application.changeState(new StateIdle(), commandName);
    }


    @Override
    public void onCommand(String commandName) {
        System.out.println("I'm busy executing command " + commandName + ", please, wait...");
    }

    @Override
    public void exit() {
        System.out.println("Leaving the command execution state");
    }
}