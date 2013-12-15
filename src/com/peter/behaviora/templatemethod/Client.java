package com.peter.behaviora.templatemethod;

public class Client {
	
	public static void main(String[] args){
		
		AddCalculator calculator = new AddCalculator();
		
		System.out.println(calculator.calculate("2+8"));
		
		SubCalculator subcalculator = new SubCalculator();
		
		System.out.println(subcalculator.calculate("8-2"));
	}

}
