package com.peter.behaviora.memento;

public class Original {
	
	private String mp;
	
	private String hp;
	
	private String haha;
	
	public Original(String mp, String hp, String haha) {
		super();
		this.mp = mp;
		this.hp = hp;
		this.haha = haha;
	}

	public Memento createMemento(){
		Memento memo = new Memento(mp,hp);
		return memo;
	}
	
	public void setMemento(Memento memo){
		mp = memo.getMp();
		hp = memo.getHp();
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

	public String getHaha() {
		return haha;
	}

	public void setHaha(String haha) {
		this.haha = haha;
	}

	@Override
	public String toString() {
		return "Original [mp=" + mp + ", hp=" + hp + ", haha=" + haha + "]";
	}
	
	

}
