package com.designpatterns.creational.abstractFactory;

/**
 * 
 * @author Ujjaval
 * This factory logic returns the required object of computer class
 */
public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
