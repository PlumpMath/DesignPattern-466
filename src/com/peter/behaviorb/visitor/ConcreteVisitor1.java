package com.peter.behaviorb.visitor;

public class ConcreteVisitor1 implements IVisitor {

	@Override
	public void visit1(ISubject subject) {

		System.out.println("I am visiting sub1");
	}

	@Override
	public void visit2(ISubject subject) {
		System.out.println("I am visiting sub2");
	}

}
