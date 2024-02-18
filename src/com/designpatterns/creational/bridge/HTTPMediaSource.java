package com.designpatterns.creational.bridge;

public class HTTPMediaSource implements MediaSource{

	@Override
	public void open() {
		  System.out.println("Connecting to HTTP media server");
		
	}

	@Override
	public void read() {
		 System.out.println("Streaming media over HTTP");
		
	}

	@Override
	public void close() {
		 System.out.println("Closing HTTP media connection");
		
	}

}
