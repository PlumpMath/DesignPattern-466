package com.peter.behaviorb.mediator;

public class User2 implements User{

	@Override
	public void inform(Mediator mediator) {
		mediator.informUser1();
	}

	@Override
	public void notified() {

		System.out.println("Recived message from User1");
	}

}
