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
	
	//浅复制
	public Object clone() throws CloneNotSupportedException{
		
		//此处调用了object.clone方法，是一个native方法
		Prototype proto = (Prototype) super.clone();
		
		return proto;
	}
	
	/**
	 * 深复制 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		//写入当前二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		
		//读取当前二进制流
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
