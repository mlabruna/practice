package com.example.test;

public class Main {

    public static void main(String[] args) {
        System.out.println(Lamp.getName());
        Lamp desklamp = new Lamp();
        System.out.println(desklamp.lightOn);
        desklamp.turnOn();
        System.out.println(desklamp.lightOn);
    }

    static class Lamp {
        boolean lightOn = false;

        void turnOn() {
            lightOn = true;
        }

        void turnOff() {
            lightOn = false;
        }

        static String getName() {
            return "This is a lamp";
        }
    }
}
