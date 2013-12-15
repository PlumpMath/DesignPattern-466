package com.peter.behaviora.memento;

public class Client {
	
	public static void main(String[] args){
		
		Original character = new Original("100","100","Start");
		
		Storage store = new Storage();
		
		System.out.println("Before I beat the boss:");
		System.out.println(character.toString());
		
		System.out.println("Save status");
		
		store.push(character.createMemento());
		
		System.out.println("Begin To Fight!");
		
		character.setHp("30");
		character.setMp("40");
		
		System.out.println("After Fight:");
		
		System.out.println(character.toString());
		
		System.out.println("The status before fight:");
		
		character.setMemento(store.pull());
		
		System.out.println(character.toString());
		
	}

}
