package com.peter.behaviorb.visitor2;

public class FailVisitor implements Visitor{

	@Override
	public void maleOperation(Subject male) {
		System.out.println("男人失败的时候会跳楼");
	}

	@Override
	public void femailOperation(Subject female) {
		System.out.println("女人失败时候会做鸡");
	}

}
