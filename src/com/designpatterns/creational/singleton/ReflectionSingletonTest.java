package com.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * 
 * There are many ways to prevent Singleton pattern from Reflection API, but one
 * of the best solutions is to throw a run-time exception in the constructor if
 * the instance already exists. In this, we can not able to create a second
 * instance.
 *
 */
public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// This code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
