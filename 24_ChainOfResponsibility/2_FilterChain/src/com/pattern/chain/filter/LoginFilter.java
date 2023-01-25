package com.pattern.chain.filter;

import com.pattern.chain.servlet.Request;
import com.pattern.chain.servlet.Response;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("LoginFilter before==>" + request );
        chain.doFilter(request,response,chain);
        System.out.println("LoginFilter after==>" + request );
    }
}
