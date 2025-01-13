package com.pattern.abstract_factory.entity.motor;

//摩托车抽象类
public abstract class Motorcycle {

    //车厂名
    private String name;
    //车型
    private String motorMake;

    public Motorcycle() {
    }

    public Motorcycle(String name, String motorMake) {
        this.name = name;
        this.motorMake = motorMake;
    }

    public String getName() {
        return name;
    }

    public String getMotorMake() {
        return motorMake;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", motorMake='" + motorMake + '\'' +
                '}';
    }
}
