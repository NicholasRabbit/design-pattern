package com.pattern.chain.controller;


/*
* 处理登录请求
* */
public class LoginController {

    //模拟登录
    public String login(String user){
        System.out.println("欢迎用户：" + user + "登录！");
        return "done";
    }

}
