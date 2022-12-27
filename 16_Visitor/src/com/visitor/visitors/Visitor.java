package com.pattern.visitor.visitors;

import com.pattern.visitor.entity.Employee;
import com.pattern.visitor.entity.Salesman;

public interface Visitor {
    void visit(Employee emp);
    void visit(Salesman sales);
}
