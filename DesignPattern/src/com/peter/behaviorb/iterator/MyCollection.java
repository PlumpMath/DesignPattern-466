package com.peter.behaviorb.iterator;

public class MyCollection implements Collection{
	
	String[] myCollection = {"A","B","C","D","E"};
	
	@Override
	public Iterator getIterator() {
		return new MyIterator(this);
	}

	@Override
	public Object getItem(int i) {
		if ((myCollection != null)&& (myCollection.length >0)){
			return myCollection[i];
		}
		
		return null;
	}

	@Override
	public int getSize() {
		
		if (myCollection != null){
			return myCollection.length;
		}
		return 0;
	}

	public String[] getMyCollection() {
		return myCollection;
	}

	public void setMyCollection(String[] myCollection) {
		this.myCollection = myCollection;
	}
	
	
}
