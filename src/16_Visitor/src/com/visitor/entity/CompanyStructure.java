package com.pattern.visitor.entity;

import com.pattern.visitor.entity.AbstractEntity;
import com.pattern.visitor.entity.Employee;
import com.pattern.visitor.entity.Salesman;
import com.pattern.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/*
* 公司组织，这里的代码结构也是稳定的，不能轻易改动
* */
public class CompanyStructure {

    private List<AbstractEntity> entityList = new ArrayList<>();

    //构造函数初始化员工列表，因为只有两个员工，就加两个
    public CompanyStructure() {
        entityList.add(new Employee(1001,"Tom","13044556622", "L1"));
        entityList.add(new Salesman(2001,"Jerry","16055226644","L3"));
    }

    //展示数据
    public void show(Visitor visitor){
        for(AbstractEntity entity : entityList){
            entity.accept(visitor);  //动态分派，”双分派“的第一次分派。
        }
    }
}
