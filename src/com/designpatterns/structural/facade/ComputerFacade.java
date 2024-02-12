package com.designpatterns.structural.facade;

public class ComputerFacade {

	private CPU cpu;
	private Memory memory;
	private OperatingSystem operatingSystem;
	private DeviceConfiguration deviceConfiguration;

	public ComputerFacade() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.operatingSystem = new OperatingSystem();
		this.deviceConfiguration = new DeviceConfiguration();
	}

	public void startComputer () {
		cpu.powerOn();
		memory.initialize();
		operatingSystem.load();
		deviceConfiguration.configureDevices();
	}

	@Override
	public String toString() {
		return "ComputerFacade [cpu=" + cpu + ", memory=" + memory + ", operatingSystem=" + operatingSystem
				+ ", deviceConfiguration=" + deviceConfiguration + "]";
	}
	
	
}
