package com.designpatterns.creational.abstractFactory;



public class AbstractFactoryDriver {

	public static void main(String[] args) {
	
		Computer PC = ComputerFactory.getComputer(new PCFactory("32 GB", "500 GB", "4.5 Ghz"));
		System.out.println(PC.toString());
	}

}
