package com.peter.construct.bridge;

public class MySqlDatabase implements IDatabase {

	@Override
	public void insert() {

		System.out.println("MySql inserting!");
	}

	@Override
	public void delete() {

		System.out.println("MySql deleting!");
	}

	
}
