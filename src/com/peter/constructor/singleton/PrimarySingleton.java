package com.peter.constructor.singleton;

public class PrimarySingleton {

	private static PrimarySingleton instance = null;

	private PrimarySingleton() {
	}

	/**
	 * 非线程安全的单例模式
	 * @return
	 */
	public static PrimarySingleton getInstance() {

		if (instance == null) {
			instance = new PrimarySingleton();
		}

		return instance;
	}

	/**
	 * 线程安全但是效率低的单利模式
	 * @return
	 */
	public static synchronized PrimarySingleton getInstanceSecure1() {

		if (instance == null) {
			instance = new PrimarySingleton();
		}

		return instance;
	}

	/**
	 * 线程安全效率高但是有Bug的单例模式
	 * @return
	 */
	public static PrimarySingleton getInstanceSecure2() {
		
		if (instance == null){
			
			synchronized (instance){
				
				if (instance == null){
					instance = new PrimarySingleton();
				}
			}
		}
		
		return instance;
	}
}
