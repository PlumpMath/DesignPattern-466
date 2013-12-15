package com.peter.behaviora.command;

public class MyCommand implements ICommand {

	Reciver reciver;
	
	public MyCommand(Reciver reciver){
		this.reciver = reciver;
	}
	
	@Override
	public void execute() {
		reciver.action();
	}

}
