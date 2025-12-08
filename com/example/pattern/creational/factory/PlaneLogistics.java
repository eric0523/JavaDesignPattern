package com.example.pattern.creational.factory;

/**
 * Author: Eric
 * Date: 2025/12/8
 */
public class PlaneLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
