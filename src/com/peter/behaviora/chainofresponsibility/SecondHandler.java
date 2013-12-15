package com.peter.behaviora.chainofresponsibility;

public class SecondHandler extends AbstractHandler{

	@Override
	public void options(int n) {
		
		if (n<=100 && n>0){
			System.out.println("second handler handled! ");
		} else{
			this.setNext(new ThirdHandler());
			next.options(n);
		}
		
	}
	
	

}
