package com.pattern.chain.filter;

import com.pattern.chain.servlet.Request;
import com.pattern.chain.servlet.Response;

/*
* Filter接口，模仿Tomcat
* */
public interface Filter {

    public abstract void doFilter(Request request, Response response, FilterChain chain);
}
