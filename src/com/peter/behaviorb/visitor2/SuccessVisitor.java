package com.peter.behaviorb.visitor2;

public class SuccessVisitor implements Visitor{

	@Override
	public void maleOperation(Subject male) {
		System.out.println("���˳ɹ�ʱ�򰮳�ʺ");
	}

	@Override
	public void femailOperation(Subject female) {
		System.out.println("Ů�˳ɹ�ʱ�򰮻�ױ");
	}

}
