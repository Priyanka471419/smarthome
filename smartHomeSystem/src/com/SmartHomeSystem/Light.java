package com.SmartHomeSystem;

public class Light implements SmartDevice {
    private String id;
    private boolean isOn;

    public Light(String id) {
        this.id = id;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light " + id + " is On.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light " + id + " is Off.");
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }

    @Override
    public String getId() {
        return id;
    }
}

