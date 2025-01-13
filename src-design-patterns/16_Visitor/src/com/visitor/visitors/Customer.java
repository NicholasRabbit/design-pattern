package com.pattern.visitor.visitors;

import com.pattern.visitor.entity.Employee;
import com.pattern.visitor.entity.Salesman;

//参观者子类
public class Customer implements Visitor{
    @Override
    public void visit(Employee emp) {
        /*
        * 在这里可是实现访问emp不同的数据，和Manager里的代码逻辑不一样，实际业务中可以进行实现不同的需求了。
        * 例如一个公司员工管理系统，用户角色登录的话，我可以用接口Dao这里从数据库查询名字和手机号，而不查他们的其他隐私数据。
        * */
        System.out.println("Customer visit:" +  ",name:" + emp.getName() + ",phone:" + emp.getPhone());
    }

    @Override
    public void visit(Salesman sales) {
        System.out.println("Customer visit:" +  ",name:" + sales.getName() + ",phone:" + sales.getPhone());
    }
}
