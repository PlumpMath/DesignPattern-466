package com.peter.behaviora.chainofresponsibility;

public class FirstHandler extends AbstractHandler {

	@Override
	public void options(int n) {
		
		if (n>100){
			System.out.println("first handler handled! ");
		} else{
			
			this.setNext(new SecondHandler());
			next.options(n);
		}
		
	}

}
