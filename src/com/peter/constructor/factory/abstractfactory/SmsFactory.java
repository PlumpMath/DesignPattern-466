package com.peter.constructor.factory.abstractfactory;

public class SmsFactory implements IFactory{

	@Override
	public Reciver createReciver() {
		return new SmsReciver();
	}
	@Override
	public Sender createSender() {
		return new SmsSender();
	}
	
	

}
