package com.pattern.command.commands;

import com.pattern.command.draw.Drawable;

import java.awt.*;

public class DrawCommand02 implements Command{
    //这里聚合执行具体绘制命令操作的对象
    protected Drawable drawable;
    //Java AWT的类
    private Point position;

    public DrawCommand02() {
    }

    public DrawCommand02(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    //执行绘制命令
    @Override
    public void execute() {
        drawable.draw(position.x,position.y);
    }
}
