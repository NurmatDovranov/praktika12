package com.company;

public class Car {
    String model;
    String color;
    double value;
    int speed;

    void uslovia() {
        if (speed > 110) {
            System.out.println("Your drive too fast");
        } else {
            if (speed < 110 || speed > 30) {
                System.out.println("your drive good");
            } else {
                System.out.println("your drive too slow");
            }
        }
    }
}
