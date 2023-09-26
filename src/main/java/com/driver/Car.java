package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.seats = seats;

        this.currentGear = 1;
    }

    public Car(String name, boolean isManual) {
        super(name);
        this.wheels = 4;
        this.type = null;
        this.doors = 0;
        this.gears = 0;
        this.isManual = isManual;
        this.seats = 0;

        this.currentGear = 1;
    }


    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    //@Override
//    public void move(int speed, int direction) {
//        super.move(speed, direction);
//    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
