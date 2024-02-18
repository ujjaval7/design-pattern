package com.designpatterns.behavioral.command;

//Concrete Command 1
public class LightOnCommand implements Command{
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
