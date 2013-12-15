package com.peter.construct.facade;

public class Client {

	public static void main(String[] args){
		
		Facade computer = new Facade();
		computer.start();
		
		computer.shutdown();
	}


}
