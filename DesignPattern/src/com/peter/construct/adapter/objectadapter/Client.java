package com.peter.construct.adapter.objectadapter;

public class Client {
	
	public static void main(String[] args){
		
		//�����target��ʵ���ǽ�ڵ�ת��
		Targetable target = new Wrapper(new Source());
		target.method1();
		target.method2();
	}

}
