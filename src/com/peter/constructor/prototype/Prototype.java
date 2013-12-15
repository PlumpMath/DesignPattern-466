package com.peter.constructor.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable{
	
	private static final long serialVersionUID = 1L;
	
	private String str;
	
	private SerializableObject obj;
	
	//ǳ����
	public Object clone() throws CloneNotSupportedException{
		
		//�˴�������object.clone��������һ��native����
		Prototype proto = (Prototype) super.clone();
		
		return proto;
	}
	
	/**
	 * ��� 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		//д�뵱ǰ��������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		
		//��ȡ��ǰ��������
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
		
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

}

class SerializableObject implements Serializable{
	private static final long serialVersionUID = 1L;
}
