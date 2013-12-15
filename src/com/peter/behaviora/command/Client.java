package com.peter.behaviora.command;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args){
		
		List<ICommand> commands = new ArrayList<ICommand>();
		
		Invoker commander = new Invoker();
		
		Reciver soldier = new Reciver();
		
		
		commander.setCommandList(commands);
		
		commands.add(new MyCommand(soldier));
		
		commands.add(new MyCommand(soldier));

		commands.add(new MyCommand(soldier));

		commander.command();
	}

}
