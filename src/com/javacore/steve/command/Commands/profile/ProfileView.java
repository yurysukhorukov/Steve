package com.javacore.steve.command.Commands.profile;

import com.javacore.steve.command.Commands.common.BaseView;
import com.javacore.steve.command.Commands.common.Canvas;

public class ProfileView extends BaseView {
    @Override
    public void draw(){
        System.out.println("Criminal Profile View: ");

        System.out.println("ID: " + ((ProfileModel)model).getId());
        System.out.println("NAme: " + ((ProfileModel)model).getName());
        System.out.println("Active: " + ((ProfileModel)model).isActive());
    }

    public void draw (Canvas canvas){
        canvas.drawText("Criminal Profile View: ");

        canvas.drawText("ID: " + ((ProfileModel)model).getId());
        canvas.drawText("NAme: " + ((ProfileModel)model).getName());
        canvas.drawText("Active: " + ((ProfileModel)model).isActive());
    }
}
