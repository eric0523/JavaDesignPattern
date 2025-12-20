package com.example.pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**In complex systems, a Registry stores pre-configured prototypes,
 * allowing clients to fetch and clone them by name.
 * The SystemManagerRegister class is a prototype that manages the prototypes.
 * Author: Eric
 * Date: 2025/12/20
 */
public class PrototypeRegistry {

    private static Map<String, GameCharacter> prototypes = new HashMap<>();

    static {
        GameCharacter warrior = new GameCharacter("Warrior");
        warrior.addEquipment("Sword");
        prototypes.put("warrior_template", warrior);
    }

    public static GameCharacter getClone(String key) {
        return prototypes.get(key).copy();
    }
}
