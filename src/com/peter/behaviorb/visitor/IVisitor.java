package com.peter.behaviorb.visitor;

/**
 * ���visitor�������ݣ�������Ϊvisitor,ͬʱ������Ҫʵ���Լ���Ҫʵ�ֵķ���������ʵ��������������
 * @author Peter
 *
 */
public interface IVisitor {
	
	public void visit1(ISubject subject);
	
	public void visit2(ISubject subject);

}
