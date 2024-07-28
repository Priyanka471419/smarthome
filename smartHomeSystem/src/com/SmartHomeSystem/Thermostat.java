package com.SmartHomeSystem;

public class Thermostat implements SmartDevice {
    private String id;
    private int temperature;

    public Thermostat(String id) {
        this.id = id;
        this.temperature = 0;
    }

    @Override
    public void turnOn() {
        // Not applicable for thermostat
    }

    @Override
    public void turnOff() {
        // Not applicable for thermostat
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " is set to " + temperature + " degrees.");
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }

    @Override
    public String getId() {
        return id;
    }
}

