package com.peter.construct.decorator;

public class Decorator implements Sourcable{

	private Sourcable source;
	
	public Decorator(Sourcable source){
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("Before decorated!");
		source.method();
		System.out.println("After decorated!");
	}

}
