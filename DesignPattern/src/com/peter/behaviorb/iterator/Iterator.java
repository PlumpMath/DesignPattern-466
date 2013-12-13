package com.peter.behaviorb.iterator;

public interface Iterator {
	
	public Object previous();
	
	public Object next();
	
	public boolean hasNext();
	
	public void setToFirst();

}
