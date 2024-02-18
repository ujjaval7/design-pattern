package com.designpatterns.creational.bridge;

/**
 * 
 * Let's consider a simplified scenario where we have a media player application
 * that needs to play audio/video files from different sources such as local
 * storage, HTTP streaming, and RTSP streaming. The Bridge pattern can be used
 * to decouple the media player's high-level logic from the specifics of each
 * media source.
 *
 */
public class MediaApplication {

	public static void main(String[] args) {
		 MediaPlayer audioPlayer = new AudioPlayer(new LocalMediaSource());
	        audioPlayer.play();
	        audioPlayer.pause();
	        audioPlayer.stop();

	        MediaPlayer videoPlayer = new VideoPlayer(new HTTPMediaSource());
	        videoPlayer.play();
	        videoPlayer.pause();
	        videoPlayer.stop();

	}

}
