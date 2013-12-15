package com.peter.behaviora.command;

import java.util.List;

public class Invoker {

	List<ICommand> commandList;

	public Invoker() {
	}

	public Invoker(List<ICommand> commandList) {
		this.commandList = commandList;
	}

	public void command() {

		if (commandList == null) {
			return;
		}

		for (ICommand item : commandList) {
			item.execute();
		}
	}

	public List<ICommand> getCommandList() {
		return commandList;
	}

	public void setCommandList(List<ICommand> commandList) {
		this.commandList = commandList;
	}
	
	

}
