package com.example.carsystem;

public class CarSystem {
    public void printSpeedingWarning(int speedLimit, int currentSpeed) {
        int difference = currentSpeed - speedLimit;
        if (difference >= 20) {
            System.out.println("Вы превысили скорость. Может прийти штраф");
        }
    }

    public void printSpeedingTicket(int speedLimit, int currentSpeed) {
        int overspeed = currentSpeed - speedLimit;

        if (overspeed >= 20 && overspeed < 40) {
            System.out.println("Может прийти штраф: 500 рублей!");
        } else if (overspeed >= 40 && overspeed < 60) {
            System.out.println("Может прийти штраф: 1000 рублей!");
        } else if (overspeed >= 60 && overspeed < 80) {
            System.out.println("Может прийти штраф: 2500 рублей!");
        } else if (overspeed >= 80) {
            System.out.println("Может прийти штраф: 5000 рублей!");
        }
    }

    public String processTrafficLightSignal(String color) {
        if (color.equals("зелёный")) {
            return "можно ехать";
        } else if (color.equals("жёлтый") || color.equals("красный")) {
            return "стой";
        }
        return "перезапросить датчики";
    }
}