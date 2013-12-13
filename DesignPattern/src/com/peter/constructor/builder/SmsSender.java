package com.peter.constructor.builder;

public class SmsSender implements Sender {

	@Override
	public void send() {

		System.out.println("This is sms sending! --From Simple Factory");
	}

}
