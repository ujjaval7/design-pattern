package com.designpatterns.creational.singleton;
/**
 * 
 * @author Ujjaval
 *
 */
public class EagerInitializedSingleton {

	 private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	    // private constructor to avoid client applications using the constructor
	    private EagerInitializedSingleton(){
	    	// this is one of the way to prevent singleton pattern
	    	if(instance!=null)
	    		throw new RuntimeException("Do not break this");
	    }

	    public static EagerInitializedSingleton getInstance() {
	        return instance;
	    }
}
