package com.pattern.command.draw;

import com.pattern.command.commands.MacroCommand;

import java.awt.*;

//执行命令的实现类，画红色
public class DrawCanvas extends Canvas implements Drawable{

    //命令历史记录
    private MacroCommand history;
    //颜色
    private Color color = Color.red;
    //半径
    private int radius = 5;

    public DrawCanvas() {

    }

    //构造函数，初始历史命令和化界面的尺寸
    public DrawCanvas(int width, int height,MacroCommand history) {
        this.history = history;
        setSize(width, height);
        setBackground(Color.white);
    }

    //全部重新绘制
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    //绘制
    @Override
    public void draw(int x,int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        
		g.fillOval(x - radius,y - radius, radius * 2, radius * 2); //这里是核心的命令语句

    }


}
