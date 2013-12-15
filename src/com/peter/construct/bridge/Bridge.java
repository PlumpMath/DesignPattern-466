package com.peter.construct.bridge;

public abstract class Bridge {
	
	private IDatabase db;
	
	public void insert(){
		db.insert();
	}
	
	public void delete(){
		db.delete();
	}

	public void setDatabase(IDatabase db){
		this.db = db;
	}
	
	public IDatabase getDatabase(){
		return db;
	}
}
