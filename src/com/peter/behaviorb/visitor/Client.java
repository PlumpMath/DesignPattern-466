package com.peter.behaviorb.visitor;

public class Client {
	
	public static void main(String[] args){
		
		ISubject subject = new ConcreteSub1();
		ISubject subject2 = new ConcreteSub2();
		IVisitor visitor = new ConcreteVisitor1();
		
		subject.accept(visitor);
		
		subject2.accept(visitor);
		
	}

}
