package com.peter.behaviorb.mediator;

public class Mediator{
	
	User user1;
	
	User user2;

	public void informUser1() {
		user1.notified();
	}
	
	public void informUser2(){
		user2.notified();
		
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}
	
	

}
