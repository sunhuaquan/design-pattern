package com.sun.dp.behavior.command;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.command.Client</li>
 * <li>Date : 2019-09-10 11:46</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args){


        RemoteController remoteController=new RemoteController();

        remoteController.addCommand(new LightOffCommand(),new LightOnCommand());


        remoteController.onButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

        remoteController.offButtonWasPushed(0);

        remoteController.addCommand(new TVOffCommand(),new TVOnCommand());

        remoteController.onButtonWasPushed(1);
    }
}
