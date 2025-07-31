package com.example.carsystem;

public class Main {
    public static void main(String[] args) {
        CarSystem carSystem = new CarSystem();

        // Демонстрация работы методов
        carSystem.printSpeedingWarning(40, 65);
        carSystem.printSpeedingTicket(40, 70);
        System.out.println(carSystem.processTrafficLightSignal("зелёный"));
    }
}