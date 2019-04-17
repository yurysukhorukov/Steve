package com.javacore.steve.command.Commands.Commands;

public abstract class ACommand {
    protected String name;
    protected String description;

    public ACommand(String name) {
        this.name = name;
    }
    public void execute(){
        System.out.println("Command " + name + " not supported");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
