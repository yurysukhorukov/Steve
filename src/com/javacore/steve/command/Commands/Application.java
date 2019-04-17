package com.javacore.steve.command.Commands;

import com.javacore.steve.command.Commands.Commands.ACommand;
import com.javacore.steve.command.Commands.Commands.CommandRegistry;
import com.javacore.steve.command.Commands.common.ConsoleCanvas;
import com.javacore.steve.command.Commands.db.Record;
import com.javacore.steve.command.Commands.db.Table;
import com.javacore.steve.command.Commands.profile.ProfileController;
import com.javacore.steve.command.Commands.profile.ProfileModel;
import com.javacore.steve.command.Commands.profile.ProfileView;
import com.javacore.steve.command.Commands.state.ApplicationState;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {

    static public final String APP_NAME = "Steve";
    static public final String AUTHOR = "Sukhorukov Yury";
    static public final String VERSION = "0.0.0";
    static ApplicationState currentState;

    public static void main(String[] args) {
        List<String> columns = new ArrayList<>();
        columns.add("id");
        columns.add("firstName");
        columns.add("lastName");
        Table criminalTable = new Table("Criminals", columns);
        List<String> values1 = new ArrayList<>();
        List<String> values2 = new ArrayList<>();
        List<String> values3 = new ArrayList<>();
        values1.add("1");
        values1.add("Vladimir");
        values1.add("Trump");
        values2.add("2");
        values2.add("Donald");
        values2.add("Timoshenko");
        values3.add("3");
        values3.add("Vladimir");
        values3.add("Trump");
        criminalTable.insert(new Record(values1));
        criminalTable.insert(new Record(values2));
        criminalTable.insert(new Record(values3));

        List<String> result = criminalTable.selectField("firstName");
        for(String s : result){
            System.out.println(s);
        }
//        ConsoleCanvas canvas = new ConsoleCanvas(15,15);
//        //canvas.setSymbolAt(0,2,'A');
//
//        canvas.drawFrame(2,3,4);
//


        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("_");
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){

                    }
                }
            }
        };
        Thread thread = new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.print(".");
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){

                    }
                }
            }
        };
        (new Thread(runnable)).start();
        thread.start();*/

        ProfileController profileController = new ProfileController();
        profileController.showProfile(1);

        System.out.println("Hello my name is " + APP_NAME);
        System.out.println("My author is " + AUTHOR);
        String commandName = "version";
        ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
        command.execute();
        commandName = "author";
        command = CommandRegistry.INSTANCE.getCommand(commandName);
    }
    public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        currentState.enter(commandName);
    }
}
