package com.careerdevs.hotelsystem.objects;

import com.careerdevs.UI.Console;

public class StandardRoom extends Room {

	private String type; // Array or List use instead.
	private int numberOfRooms;
	private int numberOfBeds;

	public StandardRoom(int roomNumber, double averagePrice, int numberOfRooms, int numberOfBeds) {
		super(roomNumber, "Standard", averagePrice);
		this.numberOfRooms = numberOfRooms;
		this.numberOfBeds = numberOfBeds;
	}

	// override reserve = if party size > beds * 2 print unavailable otherwise
	
	@Override
	public void reserve(int partySize) {
		if (partySize > numberOfBeds * 2) {
			Console.isUnavailable();
		}
	}
	// run standard reserve
	public void standardReserve() {
		
	}

}
