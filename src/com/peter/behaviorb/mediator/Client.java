package com.peter.behaviorb.mediator;

public class Client {
	
	public static void main(String[] args){
		
		Mediator mediator = new Mediator();
		
		User1 user1 = new User1();
		
		User2 user2 = new User2();
		
		mediator.setUser1(user1);
		
		mediator.setUser2(user2);
		
		user1.inform(mediator);
		
		user2.inform(mediator);
	}

}
