package com.careerdevs.hotelsystem.objects;

public class Room {

	protected int roomNumber;
	protected String roomType; // Array or List use instead.
	private int floor;
	protected Boolean isOccupied;
	private Boolean needsCleaning;
	protected Client occupant;
	protected double averagePrice;

	public Room(int roomNumber, String roomType, int floor, Boolean isOccupied, Boolean needsCleaning, Client occupant,
			double averagePrice) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.floor = floor;
		this.isOccupied = isOccupied;
		this.needsCleaning = needsCleaning;
		this.occupant = occupant;
		this.averagePrice = averagePrice;
	}

	// reserve = Should change room to isOccupied and assign the client to the
	// occupant and update client bill to average price if isOccupied and
	// needsCleaning are false otherwise print â€œunavailableâ€� Should return true
	// if successful or false if issue.
	public static void Reserve() {

	}

	// checkout = remove the client from object and mark isOccupied as false, set
	// needsCleaning to true, display o outstanding balance for the client.
	public static void Checkout() {

	}

	// clean = set needsCleaning to false
	public static void Clean() {

	}
}
