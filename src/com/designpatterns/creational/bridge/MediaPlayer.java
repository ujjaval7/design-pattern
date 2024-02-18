package com.designpatterns.creational.bridge;

public abstract class MediaPlayer {

	protected MediaSource mediaSource;

	protected MediaPlayer(MediaSource mediaSource) {
		this.mediaSource = mediaSource;
	}

	public abstract void play();

	public abstract void pause();

	public abstract void stop();
}
