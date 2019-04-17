package com.javacore.steve.command.Commands.Commands;


import static com.javacore.steve.command.Commands.Application.VERSION;
import com.javacore.steve.command.Commands.Commands.ACommand;

public class CommandVersion extends ACommand {
    public CommandVersion(String name) {
        super(name);
    }

    @Override
    public void execute(){
        System.out.println("My version is : " + VERSION);
    }
}
