package com.careerdevs.hotelsystem.objects;

public class Client {

	private String name;
	private int partySize;
	private double currentBill;
	private double prepaid;
	private String phoneNumber; // split("-")
	private int roomNumber;
	private String roomType; // Array or List use instead.

	public Client(String name, int partySize, double currentBill, double prepaid, String phoneNumber, int roomNumber,String roomType) {

		this.name = name;
		this.partySize = partySize;
		this.currentBill = currentBill;
		this.prepaid = prepaid;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}



	// makePayment = increase prepaid
	public static void MakePayment() {

	}

	// chargeRoom = increase current bill
	public static void ChargeRoom() {

	}
	// getOustanding = get outstanding balance.

	public static void getOutstandng() {

	}
}
