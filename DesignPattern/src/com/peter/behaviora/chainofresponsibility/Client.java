package com.peter.behaviora.chainofresponsibility;

public class Client {
	
	public static void main(String[] args){
		IHandler handler = new FirstHandler();
		//ע�������ʾ����ְ��������һ����ָ���õģ��������ﲻ��Ҫָ����Ҳ�е�д�����ֶ�ָ��ְ���������
		handler.options(1000);
		
		handler.options(100);
		
		handler.options(10);
		
		handler.options(0);
	}

}
