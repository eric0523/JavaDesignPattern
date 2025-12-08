package com.example.pattern.creational.factory;

/**
 * Author: Eric
 * Date: 2025/12/8
 */
public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
