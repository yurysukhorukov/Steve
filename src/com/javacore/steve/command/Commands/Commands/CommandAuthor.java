package com.javacore.steve.command.Commands.Commands;

import com.javacore.steve.command.Commands.Commands.ACommand;
import static com.javacore.steve.command.Commands.Application.AUTHOR;

public class CommandAuthor extends ACommand {

    public CommandAuthor(String name) {
        super(name);
    }

    @Override
    public void execute(){
        System.out.println("My author is : " + AUTHOR);
    }
}
