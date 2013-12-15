package com.peter.behaviorb.visitor;

public class ConcreteSub1 implements ISubject {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit1(this);
	}

}
