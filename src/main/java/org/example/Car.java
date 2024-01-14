package org.example;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}