package com.peter.behaviorb.iterator;

public class MyIterator implements Iterator{
	
	Collection myCollection;
	
	int position = -1;
	
	public MyIterator(Collection myCollection){
		this.myCollection = myCollection;
	}

	@Override
	public Object previous() {
		
		if (position >=1){
			return myCollection.getItem(--position);
		}
		return null;
	}

	@Override
	public Object next() {
		if (hasNext()){
			return myCollection.getItem(++position);
		}
		
		return null;
	}

	@Override
	public boolean hasNext() {
		
		if (position >= myCollection.getSize()-1){
			return false;
		} else{
			return true;
		}
	}

	@Override
	public void setToFirst() {
		position = -1;
	}

}
