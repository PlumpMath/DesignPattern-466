package com.peter.constructor.factory.simplefactory;

public class Client {

	public static void main(String[] args) {

		Sender mySender = SenderFactory.produce("mail");

		mySender.send();

		mySender = SenderFactory.produce("Sms");

		mySender.send();
	}
}
