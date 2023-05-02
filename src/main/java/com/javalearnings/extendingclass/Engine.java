package com.javalearnings.extendingclass;

public class Engine {
    private final String type;
    private String currentState = "Rest";

    public Engine(final String type) {
        this.type = type;
        System.out.println("Engine created");

    }
    public void start() {
        this.currentState = "Running";
    }

    public void stop() {
        this.currentState = "Rest";
    }

    public String getType() {
        return type;
    }

    public String getCurrentState() {
        return currentState;
    }
}
