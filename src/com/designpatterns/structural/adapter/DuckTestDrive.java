package com.designpatterns.structural.adapter;

public class DuckTestDrive {

	public static void main(String[] args) {

		// Using Duck interface
		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();

		// Using Turkey interface directly
		Turkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();

		System.out.println("----------------------------------");
		// Using TurkeyAdapter to make Turkey behave like a Duck
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack(); // Turkey will gobble, but we use adapter to make it quack
		turkeyAdapter.fly(); // Turkey will fly short distance, but adapter simulates longer flight

	}

}
