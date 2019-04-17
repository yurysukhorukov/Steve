package com.javacore.steve.command.Commands.profile;

import com.javacore.steve.command.Commands.common.ConsoleCanvas;

public class ProfileController {
    private ProfileModel model;
    private ProfileView view;
    private ProfileStore store;
    private ConsoleCanvas canvas;

    {
        store.INSTANCE.loadData();
        view = new ProfileView();
        canvas = new ConsoleCanvas(15,15);
    }

    public void showProfile(int id) {
        ProfileModel model = store.INSTANCE.getProfile(id);
        if (model == null){
            System.out.println("No record found with id : " + id);
        } else {
            view.setModel(model);
            view.draw(canvas);
        }
       /* ProfileView view = new ProfileView();
        ProfileModel model = new ProfileModel();
        model.setActive(true);
        model.setId(1);
        model.setFirstName("Steve");
        model.setLastName("Balmer");
        view.setModel(model);
        view.draw();*/

    }

    public ProfileModel getModel() {
        return model;
    }

    public void setModel(ProfileModel model) {
        this.model = model;
    }

    public ProfileView getView() {
        return view;
    }

    public void setView(ProfileView view) {
        this.view = view;
    }

    public ProfileStore getStore() {
        return store;
    }

    public void setStore(ProfileStore store) {
        this.store = store;
    }
}

