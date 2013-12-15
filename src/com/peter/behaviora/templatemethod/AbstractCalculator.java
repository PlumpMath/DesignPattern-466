package com.peter.behaviora.templatemethod;

public abstract class AbstractCalculator {

	public int[] split(String exp, String opt) {

		String array[] = exp.split(opt);

		int arrayInt[] = new int[2];

		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);

		return arrayInt;
	}

	//这个方法就是要延迟到子类才能实现的
	abstract public int calculate(String exp);

}
