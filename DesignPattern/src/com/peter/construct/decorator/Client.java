package com.peter.construct.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		Decorator decorator1 = new Decorator(source);
		
		Decorator decorator2 = new Decorator(decorator1);
		
		decorator1.method();
		
		System.out.println("------------------------");
		
		decorator2.method();
	}

}
