package com.peter.construct.adapter.classadapter;

public class Client {
	
	public static void main(String[] args){
		
		//�����target��ʵ���ǽ�ڵ�ת��
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}

}
