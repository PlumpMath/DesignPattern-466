package com.peter.behaviorb.visitor2;

public class Client {
	
	public static void main(String[] args){
	
		Visitor success = new SuccessVisitor();
		Visitor fail = new FailVisitor();
		
		Subject male = new ManSubject();
		
		Subject female = new FemaleSubject();
		
		male.accept(success);
		male.accept(fail);
		female.accept(success);
		female.accept(fail);
	}

}
