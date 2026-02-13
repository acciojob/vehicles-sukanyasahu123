package com.driver;
interface WaterVehicle {
    String getVehicleName();
    int getVehicleCapacity();
}
public class Boat implements WaterVehicle {
    private String name;
    private int capacity;
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getVehicleName() {
        return name;
    }
    public int getVehicleCapacity() {
        return capacity;
    }
}
