package com.sun.dp.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.command.RemoteController</li>
 * <li>Date : 2019-09-10 11:33</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class RemoteController {

    private List<Command> commandsOn = new ArrayList<>();

    private List<Command> commandsOff = new ArrayList<>();

    private Command commandUndo = new NoCommand();

    public void addCommand(Command commandOff,Command commandOn) {
        commandsOn.add(commandOn);
        commandsOff.add(commandOff);
    }
    public void onButtonWasPushed(int index){

        commandsOn.get(index).execute();
        commandUndo=commandsOn.get(index);

    }

    public void offButtonWasPushed(int index){

        commandsOff.get(index).execute();
        commandUndo=commandsOff.get(index);

    }

    public void undoButtonWasPushed() {
        commandUndo.undo();
    }


}
