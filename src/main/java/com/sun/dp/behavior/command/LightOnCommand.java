package com.sun.dp.behavior.command;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.command.LightOnCommand</li>
 * <li>Date : 2019-09-10 11:25</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver=new LightReceiver();

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
