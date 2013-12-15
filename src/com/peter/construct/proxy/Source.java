package com.peter.construct.proxy;

public class Source implements Sourcable{

	@Override
	public void method() {
		System.out.println("This is the original method!");
	}

}
