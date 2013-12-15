package com.peter.construct.proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Proxy proxy = new Proxy(new Source());
		
		proxy.method();
	}

}
