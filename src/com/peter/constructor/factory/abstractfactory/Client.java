package com.peter.constructor.factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
//		IFactory factory = new MailFactory();
		
		IFactory factory = new SmsFactory();

		Sender mySender = factory.createSender();
		
		Reciver myReciver = factory.createReciver();

		mySender.send();
		
		myReciver.recive();


	}
}
