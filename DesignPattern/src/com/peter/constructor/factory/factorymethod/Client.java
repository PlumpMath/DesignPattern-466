package com.peter.constructor.factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		
		SenderFactory factory = new MailSenderFactory();
		
		Sender mySender = factory.CreateSender();
		
		mySender.send();
		
		factory = new SmsSenderFactory();
		
		mySender = factory.CreateSender();
		
		mySender.send();

	}
}
