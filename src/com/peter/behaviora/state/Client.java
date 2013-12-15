package com.peter.behaviora.state;

public class Client {
	
	public static void main(String[] args){
		
		Context context = new Context();
		
		IState state = new ConcreteState1();
		
		context.setState(state);
		
		context.request();
		
		state = new ConcreteState2();
		
		context.setState(state);
		
		context.request();
	}

}
