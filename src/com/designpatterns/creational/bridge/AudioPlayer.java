package com.designpatterns.creational.bridge;

public class AudioPlayer extends MediaPlayer {

	protected AudioPlayer(MediaSource mediaSource) {
		super(mediaSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		mediaSource.open();
		mediaSource.read();
		System.out.println("Playing audio");

	}

	@Override
	public void pause() {
		System.out.println("Pausing audio");

	}

	@Override
	public void stop() {
		mediaSource.close();
		System.out.println("Stopping audio");

	}

}
