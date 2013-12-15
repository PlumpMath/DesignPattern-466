package com.peter.construct.adapter.classadapter;

public class Adapter extends Source implements Targetable {

	Adaptee adaptee = new Adaptee();
	@Override
	public void method1() {
		super.method1();
	}

	@Override
	public void method2() {
		adaptee.method2();
	}

}
