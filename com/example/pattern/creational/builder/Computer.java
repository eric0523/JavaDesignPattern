package com.example.pattern.creational.builder;

/**
 * Author: Eric
 * Date: 2025/12/20
 */
public class Computer {

    private final String HDD;
    private final String RAM;

    private final boolean isGraphicsEnabled;
    private final boolean isBluetoothEnabled;

    // 1. Private constructor: Only accessible by the Inner Builder class
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsEnabled = builder.isGraphicsEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Getters (No setters to ensure immutability)
    public String getHDD() { return HDD; }
    public String getRAM() { return RAM; }
    public boolean isGraphicsEnabled() { return isGraphicsEnabled; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", Bluetooth=" + isBluetoothEnabled + "]";
    }

    public static class ComputerBuilder {
        private final String HDD;
        private final String RAM;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        // Setter-like methods for optional parameters (Returning 'this' for chaining)
        public ComputerBuilder setGraphicsEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsEnabled = isGraphicsEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // 3. The build() method: Returns the final constructed object
        public Computer build() {
            return new Computer(this);
        }
    }
}
