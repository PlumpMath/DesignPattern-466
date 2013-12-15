package com.peter.behaviorb.visitor;

public class ConcreteSub2 implements ISubject {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit2(this);
	}

}
