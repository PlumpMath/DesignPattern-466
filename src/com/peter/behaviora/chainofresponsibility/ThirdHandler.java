package com.peter.behaviora.chainofresponsibility;

public class ThirdHandler extends AbstractHandler {

	@Override
	public void options(int n) {
		
			System.out.println("never handled! ");

	}

}
