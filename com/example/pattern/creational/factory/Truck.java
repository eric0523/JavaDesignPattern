package com.example.pattern.creational.factory;

/**
 * Author: Eric
 * Date: 2025/12/8
 */
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
