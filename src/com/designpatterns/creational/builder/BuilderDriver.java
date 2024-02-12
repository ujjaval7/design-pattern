package com.designpatterns.creational.builder;

public class BuilderDriver {

	public static void main(String[] args) {

		
		UserDetails userDetails = new UserDetails.UserDetailsBuilder("Ujjaval", "Prajapati")
				.address("Surat")
				.age(30)
				.phone("9033506948")
				.build();
		
		System.out.println(userDetails.toString());
	}

}
