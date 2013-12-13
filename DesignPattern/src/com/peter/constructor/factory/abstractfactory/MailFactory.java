package com.peter.constructor.factory.abstractfactory;

public class MailFactory implements IFactory{

	@Override
	public Reciver createReciver() {
		return new MailReciver();
	}

	@Override
	public Sender createSender() {
		return new MailSender();
	}
}
