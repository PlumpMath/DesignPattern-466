package com.peter.behaviorb.iterator;

public class Client {
	
	public static void main(String[] args){
		Collection collection = new MyCollection();
		
		Iterator myIterator = collection.getIterator();
		
		myIterator.setToFirst();
		
		while (myIterator.hasNext()){
			System.out.println(myIterator.next());
		}
	}

}
