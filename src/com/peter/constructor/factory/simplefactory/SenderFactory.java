package com.peter.constructor.factory.simplefactory;

public class SenderFactory {

	public static Sender produce(String type) {

		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("Sms".equals(type)) {
			return new SmsSender();
		} else {
			return null;
		}
	}

}
