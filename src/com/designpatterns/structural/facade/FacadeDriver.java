package com.designpatterns.structural.facade;

public class FacadeDriver {

	public static void main(String[] args) {
		ComputerFacade computerFacade = new ComputerFacade();
		computerFacade.startComputer();
	}
}
