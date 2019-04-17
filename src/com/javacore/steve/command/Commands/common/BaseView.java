package com.javacore.steve.command.Commands.common;

public abstract class BaseView {

    protected BaseModel model;
    public void draw(){
        System.out.println("Drawing should be implemented...");

    }

    public void draw(Canvas canvas){
        System.out.println("Drawing on canvas should be implemented...");
        /*canvas.drawRect(0,0,100,100);
        canvas.setColor();*/
    }

    public void setModel(BaseModel model){
        this.model = model;
    }
}
