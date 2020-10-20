package com.careerdevs.hotelsystem.objects;

public class Room {

	private int roomNumber;
	private String roomType; // Array or List use instead.
	private int floor;
	private Boolean isOccupied;
	private Boolean needsCleaning;
	private Client occupant;
	private double averagePrice;

	public Room(int roomNumber, String roomType,double averagePrice) {
		this.roomNumber = roomNumber%100;
		this.roomType = roomType;
		this.floor = roomNumber/100;
		isOccupied = false;
		needsCleaning = false;
		this.averagePrice = averagePrice;
	}

	// reserve = Should change room to isOccupied and assign the client to the
	// occupant and update client bill to average price if isOccupied and
	// needsCleaning are false otherwise print 'unavailable' Should return true
	// if successful or false if issue.
	public static void Reserve() {

	}

	// checkout = remove the client from object and mark isOccupied as false, set
	public static void Checkout() {
		
	}

	public Boolean getIsOccupied() {
		return isOccupied;
	}

	public void setIsOccupied(Boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	// needsCleaning to true, display o outstanding balance for the client.
	// clean = set needsCleaning to false
	public Boolean getNeedsCleaning() {
		return needsCleaning;
	}

	public void setNeedsCleaning(Boolean needsCleaning) {
		this.needsCleaning = needsCleaning;
	}

}
