package com.peter.constructor.factory.abstractfactory;

public class SmsSender implements Sender {

	@Override
	public void send() {

		System.out.println("This is sms sending! --From Abstract Factory");
	}

}
