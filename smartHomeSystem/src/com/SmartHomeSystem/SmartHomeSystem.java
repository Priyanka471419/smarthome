package com.SmartHomeSystem;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeSystem {
    private Map<Integer, SmartDevice> devices = new HashMap<>();
    private Subject subject = new Subject();

    public void addDevice(int id, String type) {
        SmartDevice device = SmartDeviceFactory.createSmartDevice(type, id);
        SmartDeviceProxy proxy = new SmartDeviceProxy(device);
        devices.put(id, proxy);
        subject.addObserver(proxy);
    }

    public void removeDevice(int id) {
        SmartDevice device = devices.remove(id);
        if (device != null) {
            subject.removeObserver((Observer) device);
        }
    }

    public void turnOnDevice(int id) {
        SmartDevice device = devices.get(id);
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("Device not found: " + id);
        }
    }

    public void turnOffDevice(int id) {
        SmartDevice device = devices.get(id);
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("Device not found: " + id);
        }
    }

    public void setSchedule(int id, String time, String command) {
        System.out.println("Scheduled: " + command + " at " + time + " for device " + id);
    }

    public void addTrigger(String condition, String action) {
        System.out.println("Trigger added: " + condition + " -> " + action);
    }

    public void getStatus() {
        for (SmartDevice device : devices.values()) {
            System.out.println(device.getStatus());
        }
    }
}
