package com.peter.construct.adapter.objectadapter;

public class Client {
	
	public static void main(String[] args){
		
		//这里的target其实就是借口的转换
		Targetable target = new Wrapper(new Source());
		target.method1();
		target.method2();
	}

}
