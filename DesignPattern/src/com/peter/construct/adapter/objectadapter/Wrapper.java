package com.peter.construct.adapter.objectadapter;

public class Wrapper implements Targetable {

	private Adaptee adaptee = new Adaptee();
	private Source source = new Source();
	
	public Wrapper(Source source){
		this.source = source;
	}
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		adaptee.method2();
	}

}
