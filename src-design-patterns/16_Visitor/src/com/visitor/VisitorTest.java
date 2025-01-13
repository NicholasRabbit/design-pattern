package com.pattern.visitor;

import com.pattern.visitor.entity.CompanyStructure;
import com.pattern.visitor.visitor.Customer;
import com.pattern.visitor.visitor.Manager;

//访问者模式测试类
/*
* 访问者模式
* 优点：
* 访问者模式是指在不改变一个元素内部结构的前提下，创建多个访问者类，实现访问获取多种不同属性的功能。
* 缺点：
* 1，具体元素对访问者公开了内部细节，违背了我迪米特原则。
* 2，违背了依赖倒转原则，访问者依赖的是具体的类，不是抽象类或接口，
* 当增加一个新类时，访问者内部的代码需要改动。
*/
public class VisitorTest {

    public static void main(String[] args) {

        //首先创建数据实体对象
        CompanyStructure company = new CompanyStructure();
        //用户访问
        company.show(new Customer());
        //公司内部经理访问
        company.show(new Manager());

    }
}
