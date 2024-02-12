package com.designpatterns.structural.flyweight;

public class ConiferTree  implements Tree{

	// Complex trunk, branch, needle graphic data
	@Override
	public void display(int x, int y) {
		System.out.println("Conifer tree is located at " + x + ", " + y);
		
	}
	
	
	

}
