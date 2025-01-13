package com.pattern.command;

import com.pattern.command.commands.MacroCommand;
import com.pattern.command.draw.DrawCanvas;
import com.pattern.command.invoker.Artist;

/*
* 测试类
* 命令模式范例参考《图解设计模式》，用到Java AWT相关知识。
* 重点学习命令模式的用法，AWT相关的后面再了解。
* 可以再添加Command的其他实现类，并添加对应的Drawable接口的实现类。
* 例，添加DrawCommand02表示另一个命令，对应的执行者是DrawCanvas02(扩展还未做完)
* */
public class CommandTest {

    public static void main(String[] args) {

        new Artist("Command Pattern Demo");
    }
}
