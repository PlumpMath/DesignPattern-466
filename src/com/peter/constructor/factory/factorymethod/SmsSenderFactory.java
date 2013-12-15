package com.peter.constructor.factory.factorymethod;

public class SmsSenderFactory implements SenderFactory {

	@Override
	public Sender CreateSender() {
		return new SmsSender();
	}
	

}
