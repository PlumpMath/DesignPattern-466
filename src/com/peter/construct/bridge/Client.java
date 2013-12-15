package com.peter.construct.bridge;

public class Client {
	
	public static void main(String[] args){
		
//		IDatabase db = new MySqlDatabase();
		
//		IDatabase db = new OracleDatabase();
		
		IDatabase db = new SQliteDatabase();
		
		Bridge myBridge = new MyBridge();
		
		myBridge.setDatabase(db);
		
		myBridge.insert();
		
		myBridge.delete();
	}

}
