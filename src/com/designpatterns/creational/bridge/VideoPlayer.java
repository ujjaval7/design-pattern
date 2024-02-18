package com.designpatterns.creational.bridge;

public class VideoPlayer extends MediaPlayer {

	protected VideoPlayer(MediaSource mediaSource) {
		super(mediaSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		mediaSource.open();
		mediaSource.read();
		System.out.println("Playing video");

	}

	@Override
	public void pause() {
		System.out.println("Pausing video");

	}

	@Override
	public void stop() {
		mediaSource.close();
		System.out.println("Stopping video");

	}

}
