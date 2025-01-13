package com.pattern.command.commands;

/**
 * 命令类的接口，即把命令当成类，或者用一个类来表示一个具体的命令，而不是某个方法来表示命令。
 * 由此让命令发布者和命令执行者解耦了
 */
public interface Command {
    public abstract void execute();
}
