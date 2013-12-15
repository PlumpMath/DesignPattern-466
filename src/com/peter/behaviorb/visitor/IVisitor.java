package com.peter.behaviorb.visitor;

/**
 * 这个visitor就是数据，数据作为visitor,同时，数据要实现自己需要实现的方法，这里实现了两个方法。
 * @author Peter
 *
 */
public interface IVisitor {
	
	public void visit1(ISubject subject);
	
	public void visit2(ISubject subject);

}
