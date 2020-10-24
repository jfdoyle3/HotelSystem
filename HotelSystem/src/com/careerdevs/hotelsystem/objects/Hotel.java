package com.careerdevs.hotelsystem.objects;

public class Hotel {

	private String hotelName;
	private int totalRooms;

	public Hotel(String hotelName, int totalRooms) {
		
		this.hotelName = hotelName;
		this.totalRooms = totalRooms;
	}

	public static void AddRoom() {

	}

	public static void ReserveRoom() {
		
	}

	public static void CheckoutRoom() {

	}

	public static void GetClientBalance() {

	}

	// addRoom = add either a standard or suite to appropriate collection

	// reserveRoom = pull a room from the correct list. if empty print "unavailable"
	// otherwise, run the checkout for the room and move the room from available to
	// reserved. Using the correct collection will make this easier. Add client to
	// clients list

	// checkoutRoom = run the checkout process for a room and move the room from
	// reserved to available.

	// getClientBalance = get the balance of a client by either their room number or
	// name
}
