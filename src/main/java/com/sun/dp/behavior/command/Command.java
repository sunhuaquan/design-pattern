package com.sun.dp.behavior.command;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.command.Command</li>
 * <li>Date : 2019-09-10 11:23</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public interface Command {

    void execute();

    void undo();
}
