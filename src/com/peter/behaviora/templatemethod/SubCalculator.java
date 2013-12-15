package com.peter.behaviora.templatemethod;

public class SubCalculator extends AbstractCalculator {

	@Override
	public int calculate(String exp) {
		
		int arrayInt[] = split(exp,"-");
		return arrayInt[0]-arrayInt[1];
	}

}
