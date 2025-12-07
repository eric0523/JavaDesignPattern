package com.example.test.creational.singleton;

import com.example.pattern.creational.singleton.ConfigurationManagerSingleton;

/**
 * Test for the ConfigurationManagerSingleton
 * @author Eric
 * @date 2025/12/07
 */
public class ConfigurationManagerSingletonTest {
    public static void main(String[] args) {
        ConfigurationManagerSingleton instance1 = ConfigurationManagerSingleton.getInstance();
        ConfigurationManagerSingleton instance2 = ConfigurationManagerSingleton.getInstance();
        System.out.println("Are both instance the same one ? " + (instance1 == instance2));
        instance1.loadSettings();
    }
}