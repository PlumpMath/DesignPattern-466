package com.peter.constructor.builder;

import java.util.List;

public class Client {

	public static void main(String[] args) {

		Builder builder = new Builder();
		
		builder.produceMailSender(10);
		
		builder.produceSmsSender(5);
		
		List<Sender> list = builder.getSenderList();
		
		for (Sender sender: list){
			sender.send();
		}

	}
}
