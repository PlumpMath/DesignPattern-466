package com.peter.constructor.factory.simplefactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		
		System.out.println("This is mail sending! --From Simple Factory");
	}

}
