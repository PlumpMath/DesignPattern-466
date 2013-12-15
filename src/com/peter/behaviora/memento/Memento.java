package com.peter.behaviora.memento;

public class Memento {
	
	private String mp;
	
	private String hp;

	public Memento(String mp, String hp) {
		super();
		this.mp = mp;
		this.hp = hp;
	}

	public String getMp() {
		return mp;
	}

	public void setMp(String mp) {
		this.mp = mp;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	

}
