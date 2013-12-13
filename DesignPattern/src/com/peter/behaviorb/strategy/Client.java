package com.peter.behaviorb.strategy;

public class Client {
	
	public static void main(String[] args){
		
		ICalculator calculator = new AddCalculator();
		
		System.out.println(calculator.calculate("2+8"));
		
		calculator = new SubCalculator();
		
		System.out.println(calculator.calculate("8-2"));
	}

}
