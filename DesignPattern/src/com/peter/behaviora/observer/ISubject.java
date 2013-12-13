package com.peter.behaviora.observer;

public interface ISubject {
	
	public void add(IObserver observer);
	
	public void delete(IObserver observer);
	
	public void notifyObserver();

}
