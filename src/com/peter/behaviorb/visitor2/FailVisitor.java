package com.peter.behaviorb.visitor2;

public class FailVisitor implements Visitor{

	@Override
	public void maleOperation(Subject male) {
		System.out.println("����ʧ�ܵ�ʱ�����¥");
	}

	@Override
	public void femailOperation(Subject female) {
		System.out.println("Ů��ʧ��ʱ�������");
	}

}
