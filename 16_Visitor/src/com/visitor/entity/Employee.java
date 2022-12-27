package com.pattern.visitor.entity;

import com.pattern.visitor.visitor.Visitor;

public class Employee extends AbstractEntity {

    /*
    * 这里用到了“双分派”
    * 1，什么是分派(dispatch)？
    * 指根据对象的类型而对其调用的方法进选择，就是分派，即分派方法，因为多态中会根据引用调用不同子类实现的方法。
    * 发生在编译时的分派叫静态分派，例如重载（overload），发生在运行时的分派叫动态分派，例如重写（overwrite）
    * 2，以静态分派-重载为例，首先要判断引用指向那个子类，然后判断子类调用方法时是否有重载，这个过程就实现了多分派。
    * 3，为什么这里是双分派？
    * 当在CompanyStructure.java里遍历时根据 entity引用来指派调用哪个子类的accept(..)方法，即指派哪个子类重写了方法，这是一次动态分派
    * 然后在本代码中的accept(..)的形参visitor也是个接口引用，也需要指派调用哪个子类重新的visit(..)方法，这是第二次动态分派。
    * 因此是“双分派”，但这个是“伪双分派”，原因是因为在Java中动态分派是单分派的，由两个动态分派“单分派”组成了这个“双分派”，所以称作伪的。
    * */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Employee() {
    }
    public Employee(int id,String name,String phone,String level){
        super(id, name, phone, level);
    }
}
