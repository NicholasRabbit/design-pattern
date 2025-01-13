package com.pattern.chain;


import com.pattern.chain.controller.LoginController;
import com.pattern.chain.filter.*;
import com.pattern.chain.servlet.Request;
import com.pattern.chain.servlet.Response;

/*
* 职责链的复杂形式。
* Tomcat中的过滤器Filter就用到了职责链模式，本例仿照其写法学习职责链的复杂形式。
*
* 详细笔记见FilterChain.java
* */
public class ChainTest {

    public static void main(String[] args) {

        //初始化各个对象
        Filter cef = new CharacterEncodingFilter();
        Filter fef = new FileEncodingFilter();
        Filter loginFilter = new LoginFilter();
        LoginController loginController = new LoginController();
        FilterChain filterChain = new FilterChain(loginController);

        //依次添加各个Filter
        filterChain.add(cef);
        filterChain.add(fef);
        filterChain.add(loginFilter);

        //第一个filter开始调用
        filterChain.doFilter(new Request(),new Response(),filterChain);

    }
}
