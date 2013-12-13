package com.peter.constructor.factory.abstractfactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		
		System.out.println("This is mail sending! --From Abstract Factory");
	}

}
