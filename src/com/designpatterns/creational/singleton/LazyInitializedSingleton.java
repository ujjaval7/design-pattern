package com.designpatterns.creational.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;

	// Private constructor to prevent instantiation from outside the class
	private LazyInitializedSingleton() {
	}

	// Public static method to get the single instance of the class
	public static LazyInitializedSingleton getInstance() {
		// Lazy initialization: create the instance only when it's first requested
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

	// Other methods and properties of the class...
}
