package com.peter.behaviorb.iterator;

public interface Collection {
	
	public Iterator getIterator();
	
	public Object getItem(int i);
	
	public int getSize();

}
