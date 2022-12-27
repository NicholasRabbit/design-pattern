package com.pattern.visitor;

import com.pattern.visitor.entity.CompanyStructure;
import com.pattern.visitor.visitor.Customer;
import com.pattern.visitor.visitor.Manager;

//访问者模式测试类
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
