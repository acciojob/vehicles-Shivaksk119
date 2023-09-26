package com.driver;

public class Boat implements WaterVehicle{
    private String name = "Black Pearl";
    private int capacity = 1000;

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}