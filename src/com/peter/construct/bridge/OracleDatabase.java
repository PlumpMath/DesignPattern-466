package com.peter.construct.bridge;

public class OracleDatabase implements IDatabase {

	@Override
	public void insert() {

		System.out.println("Oracle inserting!");
	}

	@Override
	public void delete() {

		System.out.println("Oracle deleting!");
	}

}
