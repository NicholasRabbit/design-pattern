package com.pattern.command.commands;

import java.util.Iterator;
import java.util.Stack;

/*
* 具体的命令类，这个是多个命令组合在一起的一个命令类
*
*/
public class MacroCommand implements Command {

    //用栈表示多个命令的集合，不用集合表示是因为用栈方便撤销上一条命令。
    //这里用到了组合模式(Composite Pattern)来实现操作
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        //执行所有的命令
        while(it.hasNext()){
            it.next().execute();
        }
    }

    //添加命令
    public void append(Command cmd){
        /*
        * 注意不能添加this.execute()，因为本类的execute()方法用来执行其他的多个命令的集合，
        * 加后就造成递归，而且是死循环，即this.execute(..)的方法里还调用this.execute(..)
        */
        if(this != cmd){
            commands.push(cmd);
        }
    }

    //清空命令
    public void clear(){
        commands.clear();  //使用Stack的clear()方法即可。
    }

    //撤销上条命令
    public void undo(){
        if(!commands.empty()){
            commands.pop();
        }
    }
}
