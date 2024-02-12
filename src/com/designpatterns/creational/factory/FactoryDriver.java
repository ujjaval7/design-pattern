package com.designpatterns.creational.factory;

public class FactoryDriver {

	public static void main(String[] args) {
		
		Computer PC = ComputerFactory.getComputer("pc", "32 GB", "500 GB", "4.5 Ghz");
		System.out.println(PC.toString());
	}
}
