package com.example.test.creational.singleton;

import com.example.pattern.creational.builder.Computer;

/**
 * Author: Eric
 * Date: 2025/12/20
 */
public class BuilderTest {
    public static void main(String[] args) {
        // Using the builder to create a computer with only required fields
        Computer basicComp = new Computer.ComputerBuilder("500 GB", "8 GB")
                .build();

        // Using the builder to create a fully customized computer
        Computer gamingComp = new Computer.ComputerBuilder("2 TB", "32 GB")
                .setGraphicsEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(basicComp);
        System.out.println(gamingComp);
    }
}
