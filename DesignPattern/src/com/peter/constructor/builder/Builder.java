package com.peter.constructor.builder;

import java.util.ArrayList;
import java.util.List;


public class Builder {
	
	private List<Sender> senderList = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for (int i=0; i<count;i++){
			senderList.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for (int i=0; i<count; i++){
			senderList.add(new SmsSender());
		}
	}

	public List<Sender> getSenderList() {
		return senderList;
	}
	

}
