package com.peter.constructor.singleton;

public class PerfectSingleton {
	
	private static PerfectSingleton instance = null;
	
	private PerfectSingleton(){
		
	}
	
	public static PerfectSingleton getInstance(){
		
		return SingletonFactory.instance;
		
	}
	
	private static class SingletonFactory{
		
		private static PerfectSingleton instance = new PerfectSingleton();
	}

}
