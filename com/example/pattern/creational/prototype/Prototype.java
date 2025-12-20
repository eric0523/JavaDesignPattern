package com.example.pattern.creational.prototype;

/**
 * 1. The Modern Approach: Using a Custom Interface
 * The Prototype Pattern is a creational design pattern used to create new objects
 * by copying an existing instance (the "prototype") instead of building them from scratch.
 * @param <T>
 */
public interface Prototype<T> {
    T copy();
}
