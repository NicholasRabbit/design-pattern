package com.pattern.visitor.entity;

import com.pattern.visitor.visitor.Visitor;

//所有员工的抽象类
public abstract class AbstractEntity {

    private int id;
    private String name;
    private String phone;
    private String level;  //级别

    public AbstractEntity() {
    }

    public AbstractEntity(int id, String name, String phone, String level) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.level = level;
    }

    //抽象的双分派的其中一个方法，由子类实现
    public abstract void accept(Visitor visitor);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }



}
