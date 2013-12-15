package com.peter.behaviora.chainofresponsibility;

public class Client {
	
	public static void main(String[] args){
		IHandler handler = new FirstHandler();
		//注意在这个示例中职责连的下一段是指定好的，所以这里不需要指定，也有的写法是手动指定职责连后继者
		handler.options(1000);
		
		handler.options(100);
		
		handler.options(10);
		
		handler.options(0);
	}

}
