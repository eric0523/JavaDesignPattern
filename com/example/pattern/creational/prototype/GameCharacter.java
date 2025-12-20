package com.example.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation
 * Author: Eric
 * Date: 2025/12/20
 */
public class GameCharacter implements Prototype<GameCharacter> {
    private String name;
    private List<String> equipment;

    public GameCharacter(String name) {
        this.name = name;
        this.equipment = new ArrayList<>();
    }

    @Override
    public GameCharacter copy() {
        GameCharacter clone = new GameCharacter(this.name);
        clone.equipment = new ArrayList<>(this.equipment);
        return clone;
    }

    public void addEquipment(String item) {
        this.equipment.add(item);
    }
    @Override
    public String toString() { return "Character: " + name + " with " + equipment; }
}
