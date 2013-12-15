package com.peter.behaviora.state;

public class Context {
	
	IState state;

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}
	
	public void request(){
		state.handle();
	}
	

}
