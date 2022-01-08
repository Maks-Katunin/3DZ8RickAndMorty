package com.geektech.a3dz8rickandmorty.ForCharacter;

import java.io.Serializable;

public class CharacterModel implements Serializable {
    private int character;
    private String deadOrAlive, name;

    public CharacterModel(int character, String deadOrAlive, String name) {
        this.character = character;
        this.deadOrAlive = deadOrAlive;
        this.name = name;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
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
}
