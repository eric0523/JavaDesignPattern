package com.example.pattern.creational.prototype;

/**
 * 2. The Old Approach: Using Cloning
 * Author: Eric
 * Date: 2025/12/20
 */
public class Shape {
    private String color;

    public Shape(String color) { this.color = color; }

    @Override
    public Shape clone() {
        try {
            // Performs a field-by-field copy
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should not happen if Cloneable is implemented
        }
    }
}
