package com.geektech.a3dz8rickandmorty.ForSingInScreenFragment;

public class SingInScreenModel {

    private String deadOrAlive, name;
    private int image;

    public SingInScreenModel(String deadOrAlive, String name, int image) {
        this.deadOrAlive = deadOrAlive;
        this.name = name;
        this.image = image;
    }

    public String getDeadOrAlive() {
        return deadOrAlive;
    }

    public void setDeadOrAlive(String deadOrAlive) {
        this.deadOrAlive = deadOrAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
