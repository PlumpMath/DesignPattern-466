package com.peter.constructor.factory.factorymethod;

public class MailSenderFactory implements SenderFactory{

	@Override
	public Sender CreateSender() {
		return new MailSender();
	}

}
