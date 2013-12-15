package com.peter.construct.bridge;

public class SQliteDatabase implements IDatabase{

	@Override
	public void insert() {

		System.out.println("SQlite inserting!");
	}

	@Override
	public void delete() {
		
		System.out.println("SQlite deleting!");
	}

}
