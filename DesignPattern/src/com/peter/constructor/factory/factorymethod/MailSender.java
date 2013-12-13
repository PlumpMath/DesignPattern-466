package com.peter.constructor.factory.factorymethod;

public class MailSender implements Sender {

	@Override
	public void send() {
		
		System.out.println("This is mail sending! --From Factory Method");
	}

}
