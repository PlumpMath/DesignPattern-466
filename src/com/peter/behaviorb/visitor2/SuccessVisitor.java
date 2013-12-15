package com.peter.behaviorb.visitor2;

public class SuccessVisitor implements Visitor{

	@Override
	public void maleOperation(Subject male) {
		System.out.println("男人成功时候爱吃屎");
	}

	@Override
	public void femailOperation(Subject female) {
		System.out.println("女人成功时候爱化妆");
	}

}
