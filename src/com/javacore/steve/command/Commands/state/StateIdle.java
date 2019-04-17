package com.javacore.steve.command.Commands.state;
import com.javacore.steve.command.Commands.Application;


public class StateIdle extends ApplicationState {

    @Override
    public void enter(String commandName) {
        System.out.println("Entering idle state");
    }

    @Override
    public void onCommand(String commandName) {
        System.out.println("New command received, starting execution " + commandName);
        Application.changeState(new StateExecutingCommand(), commandName);
    }

    @Override
    public void exit() {
        System.out.println("Exiting idle state");
    }
}