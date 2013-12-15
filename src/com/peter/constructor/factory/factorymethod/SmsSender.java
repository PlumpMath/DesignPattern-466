package com.peter.constructor.factory.factorymethod;

public class SmsSender implements Sender {

	@Override
	public void send() {

		System.out.println("This is sms sending! --From Factory Method");
	}

}
