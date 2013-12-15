package com.peter.behaviora.observer;

public class Client {
	
	public static void main(String[] args){
		MySubject subject = new MySubject();
		
		subject.add(new Observer1());
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.add(new Observer1());
		subject.add(new Observer2());
		
		subject.options();
	}

}
