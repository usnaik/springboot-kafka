package com.springboot.model;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private String apartment;
	private String street;
	private String state;
	private String city;
	private String postCode;

	public Address(String apartment, String street, String state, String city, String postCode) {
		this.apartment = apartment;
		this.street = street;
		this.state = state;
		this.city = city;
		this.postCode = postCode;
	}

	public Address() {
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [apartment=" + apartment + ", street=" + street + ", state=" + state + ", city=" + city
				+ ", postCode=" + postCode + "]";
	}
}
