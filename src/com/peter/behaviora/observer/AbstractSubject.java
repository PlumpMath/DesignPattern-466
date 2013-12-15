package com.peter.behaviora.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements ISubject {

	List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void add(IObserver observer) {

		if (observers != null) {
			observers.add(observer);
		}
	}

	@Override
	public void delete(IObserver observer) {

		if ((observers != null) && (observers.size() > 0)) {
			if (observers.contains(observer)) {
				observers.remove(observer);
			}
		}
	}

	@Override
	public void notifyObserver() {

		if (observers != null){
			for (IObserver observer: observers){
				observer.update();
			}
		}
	}
}
