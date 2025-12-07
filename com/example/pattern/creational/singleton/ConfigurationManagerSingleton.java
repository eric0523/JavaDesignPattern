package com.example.pattern.creational.singleton;

/**
 * Singleton class that uses double-checked locking (DCL) to ensure thread safety.
 * @author Eric
 * @date 2025/12/07
 */
public class ConfigurationManagerSingleton {
    // The 'volatile' keyword is crucial here.
    // It ensures that any thread reading the 'instance' variable sees the most
    // up-to-date value, preventing memory consistency errors that can occur
    // during the object creation process in a multi-threaded environment.
    private static volatile ConfigurationManagerSingleton instance;

    // Private constructor prevents direct instantiation
    private ConfigurationManagerSingleton() {
        if (instance != null) {
            // Optional: Prevent instantiation via reflection
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     * Public static method to get the ConfigurationManager instance using DCL.
     */
    public static ConfigurationManagerSingleton getInstance() {
        // First check: Check if the instance is already created outside the lock.
        // This avoids locking every time the method is called after the first creation.
        if (instance == null) {
            // Synchronized block: Lock the class only if the instance is null.
            synchronized (ConfigurationManagerSingleton.class) {
                // Second check: Re-check inside the lock to ensure only one thread
                // creates the new instance if multiple threads enter the synchronized block.
                if (instance == null) {
                    instance = new ConfigurationManagerSingleton();
                }
            }
        }
        return instance;
    }

    // Example methods for the singleton
    public void loadSettings() {
        System.out.println("Loading settings for the configuration manager.");
    }
}