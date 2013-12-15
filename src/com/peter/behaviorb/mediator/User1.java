package com.peter.behaviorb.mediator;

public class User1 implements User{

	@Override
	public void inform(Mediator mediator) {
		mediator.informUser2();
	}

	@Override
	public void notified() {

		System.out.println("Recived message from User2");
	}

}
