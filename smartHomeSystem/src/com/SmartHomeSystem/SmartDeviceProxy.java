package com.SmartHomeSystem;

public class SmartDeviceProxy implements SmartDevice, Observer {
    private SmartDevice realDevice;

    public SmartDeviceProxy(SmartDevice realDevice) {
        this.realDevice = realDevice;
    }

    @Override
    public void turnOn() {
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        realDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return realDevice.getStatus();
    }

    @Override
    public String getId() {
        return realDevice.getId();
    }

    @Override
    public void update() {
        System.out.println("Device " + realDevice.getId() + " has been updated.");
    }
}

