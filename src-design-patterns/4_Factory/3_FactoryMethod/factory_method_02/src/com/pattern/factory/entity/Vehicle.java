package com.pattern.factory.entity;

//汽车抽象类
public abstract class Vehicle {
    //车厂名
    private String name;
    //车型
    private String carMake;

    public Vehicle() {
    }

    public Vehicle(String name, String carMake) {
        this.name = name;
        this.carMake = carMake;
    }

    public String getName() {
        return name;
    }

    public String getCarMake() {
        return carMake;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", carMake='" + carMake + '\'' +
                '}';
    }
}
