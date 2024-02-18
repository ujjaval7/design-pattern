package com.designpatterns.creational.proxy;

/**
 * 
 * Consider a scenario where your application needs to load and display images,
 * and you want to optimize the image loading process. Loading images from disk
 * or other external sources can be resource-intensive, especially if the images
 * are large or stored remotely.
 *
 */
public class ProxyPatternExample {
	public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");
 
        // Image will be loaded from disk only when display() is called
        image.display();
 
        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}
