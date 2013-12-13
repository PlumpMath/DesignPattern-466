package com.peter.constructor.factory.abstractfactory;

public class SmsReciver implements Reciver{

	@Override
	public void recive() {
		System.out.println("This is SmsReciver! --From Abstract Factory");
	}

}
