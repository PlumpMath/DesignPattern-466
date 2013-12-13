package com.peter.behaviora.observer;


public class Observer1 implements IObserver{

	@Override
	public void update() {

		System.out.println("Observer1 is updating!");
	}

}
