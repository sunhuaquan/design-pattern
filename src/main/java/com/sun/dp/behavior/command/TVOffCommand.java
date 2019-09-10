package com.sun.dp.behavior.command;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.command.TVOffCommand</li>
 * <li>Date : 2019-09-10 11:57</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class TVOffCommand implements Command {

    private TVReceiver tvReceiver=new TVReceiver();

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
