package com.example.pattern.creational.factory;

/**
 * Author: Eric
 * Date: 2025/12/8
 */
public class Plane implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by plane");
    }
}
