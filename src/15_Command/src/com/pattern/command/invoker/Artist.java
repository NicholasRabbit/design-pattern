package com.pattern.command.invoker;

import com.pattern.command.commands.DrawCommand;
import com.pattern.command.commands.MacroCommand;
import com.pattern.command.draw.DrawCanvas;

import javax.swing.*;
import java.awt.event.*;

//画家，担任命令发布者的角色，就是这个图形界面
public class Artist extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    //绘制的历史记录
    private MacroCommand history = new MacroCommand();
    //绘制的面板区域，红色画笔
    private DrawCanvas canvas = new DrawCanvas(400,400,history);
    
    //清除按钮
    private JButton clearButton = new JButton("clear");

    public Artist(){
    }

    public Artist(String title){
        //初始化，设置名称
        super(title);
        //绑定时间
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        //设置展示的层级
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        //
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearButton){
            history.clear();  //清空历史
            canvas.repaint(); //画板重置
        }
    }

    //鼠标拖拽方法
    @Override
    public void mouseDragged(MouseEvent e) {
        DrawCommand cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);   //把用户的操作添加到历史记录里
        cmd.execute();   //执行操作
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    //关闭窗口
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
