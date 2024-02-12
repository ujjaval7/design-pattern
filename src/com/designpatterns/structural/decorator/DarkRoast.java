package com.designpatterns.structural.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	public double cost() {
		return .99;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
