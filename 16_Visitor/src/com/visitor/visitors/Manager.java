package com.pattern.visitor.visitors;

import com.pattern.visitor.entity.Employee;
import com.pattern.visitor.entity.Salesman;

//参观者子类
public class Manager implements Visitor{
    @Override
    public void visit(Employee emp) {
        System.out.println("manager visit:" + "id:" +  emp.getId() + ",name:" + emp.getName() + ",level:" + emp.getLevel());
    }

    @Override
    public void visit(Salesman sales) {
        System.out.println("manager visit:" + "id:" +  sales.getId() + ",name:" + sales.getName() + ",level:" + sales.getLevel());
    }
}
