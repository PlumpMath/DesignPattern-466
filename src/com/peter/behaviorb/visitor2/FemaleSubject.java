package com.peter.behaviorb.visitor2;

public class FemaleSubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.femailOperation(this);
	}

}
