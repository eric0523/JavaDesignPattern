package com.example.test.creational.singleton;

import com.example.pattern.creational.prototype.GameCharacter;
import com.example.pattern.creational.prototype.PrototypeRegistry;
import com.example.pattern.creational.prototype.Shape;

/**
 * Author: Eric
 * Date: 2025/12/20
 */
public class PrototypeTest {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter("Prototype");
        GameCharacter character2 = character1.copy();
        System.out.println(character1 == character2);

        Shape shape1 = new Shape("Red");
        //Not allowed,
//        Shape shape2 = shape1.clone();

        GameCharacter gameCharacter = PrototypeRegistry.getClone("warrior_template");
        System.out.println(gameCharacter);
    }
}
