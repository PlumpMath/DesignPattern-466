package com.peter.behaviora.observer;

public class MySubject extends AbstractSubject {
	
	public void options(){
		
		System.out.println("Begin to update!");
		notifyObserver();
		
	}

}
