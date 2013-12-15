package com.peter.behaviorb.visitor2;

public class ManSubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		
		visitor.maleOperation(this);
		
	}

}
