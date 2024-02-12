package com.designpatterns.creational.singleton;

public class SingletonDriver {

	public static void main(String[] args) {

		EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
		 System.out.println( eagerInitializedSingleton1 == eagerInitializedSingleton2);
		LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
		// Both instances should be the same
        System.out.println(lazyInitializedSingleton1 == lazyInitializedSingleton2);

        
        SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
        SerializedSingleton serializedSingleton2 = SerializedSingleton.getInstance();
        System.out.println(serializedSingleton1 == serializedSingleton2);
	}

}
