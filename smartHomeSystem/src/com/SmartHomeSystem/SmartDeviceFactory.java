package com.SmartHomeSystem;

public class SmartDeviceFactory {
    public static SmartDevice createSmartDevice(String type, int id) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light("Light-" + id);
            case "thermostat":
                return new Thermostat("Thermostat-" + id);
            case "door":
                return new DoorLock("Door-" + id);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
