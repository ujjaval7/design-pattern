package com.designpatterns.creational.builder;

public class UserDetails {

	private final String firstName ; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address;; // optional

	private UserDetails(UserDetailsBuilder userDetailsBuilder) {
		this.firstName = userDetailsBuilder.firstName;
		this.lastName = userDetailsBuilder.lastName;
		this.age = userDetailsBuilder.age;
		this.phone = userDetailsBuilder.phone;
		this.address = userDetailsBuilder.address;
	}

	// All getter, and NO setter to provde immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class UserDetailsBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;

		public UserDetailsBuilder(String firstname, String lastname) {
			this.firstName = firstname;
			this.lastName = lastname;
		}

		public UserDetailsBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserDetailsBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserDetailsBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		//Return the finally constructed User object
		public UserDetails build() {
			UserDetails user = new UserDetails(this);
			return user;
		}
	}

}
