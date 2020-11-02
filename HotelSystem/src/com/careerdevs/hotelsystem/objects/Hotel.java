package com.careerdevs.hotelsystem.objects;

import java.util.HashMap;

public class Hotel {

	private String hotelName;
	private int totalRooms;
	private int addRoom;
	private HashMap<String, Integer> hotel;

	public Hotel(String hotelName, int totalRooms) {

		this.hotelName = hotelName;
		this.totalRooms = totalRooms;
	}

	public void AddRoom() {
		addRoom++;
		if (addRoom > totalRooms) {
			System.out.println("Hotel Full");
		}

	}

	public void ReserveRoom() {
		
	}

	public void CheckoutRoom() {

	}

	public void GetClientBalance() {

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
