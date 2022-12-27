package com.pattern.visitor.entity;

import com.pattern.visitor.visitor.Visitor;

public class Salesman extends AbstractEntity{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Salesman() {
    }

    public Salesman(int id, String name, String phone, String level) {
        super(id, name, phone, level);
    }
}
