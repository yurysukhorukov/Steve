package com.javacore.steve.command.Commands.profile;

import com.javacore.steve.command.Commands.common.BaseModel;

import java.util.Date;

public class ProfileModel extends BaseModel {
    private int id;
    private String firstName;
    private String lastName;
    private String nickname;
    private int numberOfCrimes;
    private Date dateOfBirth;
    private boolean deceased;
    private String description;
    private String placeOfBirth;
    private Date dateOfDeath;
    private String placeOfDeath;
    private boolean active;

    public static ProfileModel randomModel(){
        int rId = (int)(10*Math.random());
        boolean rActive = rId % 2 ==0;
        String rFirstName = "Steve " + rId;
        String rLastName = "Balmer " + rId;

        return new ProfileModel(rId, rFirstName, rLastName, rActive);
    }

    public ProfileModel(int id, String firstName, String lastName, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive(){
        return active;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public void setActive(boolean active){
        this.active = active;
    }
}