package com.peter.behaviora.state;

public class ConcreteState1 implements IState{

	@Override
	public void handle() {
		System.out.println("This is concrete State1!");
	}

}
