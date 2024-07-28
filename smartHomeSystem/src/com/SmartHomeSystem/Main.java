package com.SmartHomeSystem;

//Main.java
public class Main {
 public static void main(String[] args) {
     SmartHomeSystem smartHomeSystem = new SmartHomeSystem();

     smartHomeSystem.addDevice(1, "light");
     smartHomeSystem.addDevice(2, "thermostat");
     smartHomeSystem.addDevice(3, "door");

     smartHomeSystem.turnOnDevice(1);
     smartHomeSystem.turnOnDevice(2);
     smartHomeSystem.turnOffDevice(3);

     smartHomeSystem.setSchedule(2, "06:00", "Turn On");
     smartHomeSystem.addTrigger("temperature > 75", "turnOff(1)");

     smartHomeSystem.getStatus();
 }
}
