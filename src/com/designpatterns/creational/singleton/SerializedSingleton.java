package com.designpatterns.creational.singleton;

/**
 * 
 * Sometimes in distributed systems, we need to implement Serializable interface
 * in the singleton class so that we can store its state in the file system and
 * retrieve it at a later point in time. Here is a small singleton class that
 * implements Serializable interface also:
 *
 */
public class SerializedSingleton {
	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	/**
	 * 
	 * While deserlize this it destroys the singleton pattern. To overcome this scenario, all we need
	 * to do is provide the implementation of readResolve() method.
	 */
	protected Object readResolve() {
		return getInstance();
	}
}
