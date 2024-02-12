package com.designpatterns.creational.factory;

/**
 * 
 * @author Ujjaval
 * This factory class which is responsible which subclass's object it needs to return.
 */
public class ComputerFactory {

	private static final String SERVER = "SERVER";
	private static final String PC = "PC";

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if (PC.equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if (SERVER.equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		return null;
	}
}
