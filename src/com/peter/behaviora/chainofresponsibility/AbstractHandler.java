package com.peter.behaviora.chainofresponsibility;

public abstract class AbstractHandler implements IHandler {

	IHandler next;

	@Override
	abstract public void options(int n);

	public IHandler getNext() {
		return next;
	}

	public void setNext(IHandler next) {
		this.next = next;
	}
	
	
}
