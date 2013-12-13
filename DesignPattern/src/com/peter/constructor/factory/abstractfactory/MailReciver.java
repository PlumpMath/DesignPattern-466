package com.peter.constructor.factory.abstractfactory;

public class MailReciver implements Reciver {

	@Override
	public void recive() {
		System.out.println("MailReciver has recived! --From Abstract Factory");
	}

}
