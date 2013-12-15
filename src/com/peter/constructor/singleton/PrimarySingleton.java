package com.peter.constructor.singleton;

public class PrimarySingleton {

	private static PrimarySingleton instance = null;

	private PrimarySingleton() {
	}

	/**
	 * ���̰߳�ȫ�ĵ���ģʽ
	 * @return
	 */
	public static PrimarySingleton getInstance() {

		if (instance == null) {
			instance = new PrimarySingleton();
		}

		return instance;
	}

	/**
	 * �̰߳�ȫ����Ч�ʵ͵ĵ���ģʽ
	 * @return
	 */
	public static synchronized PrimarySingleton getInstanceSecure1() {

		if (instance == null) {
			instance = new PrimarySingleton();
		}

		return instance;
	}

	/**
	 * �̰߳�ȫЧ�ʸߵ�����Bug�ĵ���ģʽ
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
