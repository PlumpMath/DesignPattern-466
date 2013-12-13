package com.peter.construct.proxy;

public class Proxy implements Sourcable{
	
	Sourcable source;
	
	
	public Proxy(Sourcable source){
		this.source = source;
	}


	@Override
	public void method() {

		before();
		source.method();
		after();
	}


	private void after() {

		System.out.println("After doing something.");
	}


	private void before() {

		System.out.println("Before doing something.");
	}
	
	
}
