package com.example.pattern.creational.factory;

/**
 * Abstract Creator Class
 * Author: Eric
 * Date: 2025/12/8
 */
public abstract class Logistics {
    // The core business logic that uses the product
    public void planDelivery() {
        Transport transport = createTransport(); // The factory method is called here
        transport.deliver();
    }

    // The abstract factory method: Subclasses must implement this
    // to decide which concrete product to return.
    public abstract Transport createTransport();
}
