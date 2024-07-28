package com.SmartHomeSystem;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
    String getId();
}
