package com.careerdevs.hotelsystem.objects;

import java.util.HashMap;

public class Client {

	private String name;
	private int partySize;
	private double currentBill;
	private double prepaid;
	private String phoneNumber; // split("-")
	private int roomNumber;
	private String roomType; // Array or List use instead.
	private HashMap<String,Object> clientInfo;

	public Client (String name,String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Client(String name, int partySize, double currentBill, double prepaid, String phoneNumber, int roomNumber,
			String roomType) {

		this.name = name;
		this.partySize = partySize;
		this.currentBill = currentBill;
		this.prepaid = prepaid;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	public double MakePayment(double increase) {
		return prepaid + increase;
	}

	public double ChargeRoom(double charge) {
		return charge + currentBill;
	}

	public double getOutstandng() {
		return currentBill;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


	



	
}
