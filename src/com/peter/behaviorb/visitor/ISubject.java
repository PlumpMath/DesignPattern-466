package com.peter.behaviorb.visitor;

/**
 * 被访问的对象,也就是数据结构
 * @author Peter
 *
 */
public interface ISubject {
	
	public void accept(IVisitor visitor);

}
