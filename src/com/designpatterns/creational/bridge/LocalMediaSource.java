package com.designpatterns.creational.bridge;

public class LocalMediaSource implements MediaSource {

	@Override
	public void open() {
		 System.out.println("Opening local media file");
		
	}

	@Override
	public void read() {
		 System.out.println("Reading from local media file");
		
	}

	@Override
	public void close() {
		 System.out.println("Closing local media file");
		
	}

}
