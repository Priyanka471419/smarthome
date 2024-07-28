package com.SmartHomeSystem;

public class DoorLock implements SmartDevice {
    private String id;
    private boolean isLocked;

    public DoorLock(String id) {
        this.id = id;
        this.isLocked = false;
    }

    @Override
    public void turnOn() {
        isLocked = true;
        System.out.println("Door " + id + " is Locked.");
    }

    @Override
    public void turnOff() {
        isLocked = false;
        System.out.println("Door " + id + " is Unlocked.");
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }

    @Override
    public String getId() {
        return id;
    }
}
