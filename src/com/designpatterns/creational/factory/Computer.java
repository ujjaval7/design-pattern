package com.designpatterns.creational.factory;

/**
 * 
 * @author Ujjaval
 * This is base class having two subclasses(PC and Server). We can take this as interface as well.
 */
public abstract class Computer {
	
	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
	
	

}
