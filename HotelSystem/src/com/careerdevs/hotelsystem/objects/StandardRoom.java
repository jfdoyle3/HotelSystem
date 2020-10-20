package com.careerdevs.hotelsystem.objects;

public class StandardRoom extends Room {

    private String type; // Array or List use instead.
    private int numberOfRooms;
    private int numberOfBeds;
    
	public StandardRoom(int roomNumber,double averagePrice, int numberOfRooms, int numberOfBeds) {
		super(roomNumber, "Standard", averagePrice);
		this.numberOfRooms = numberOfRooms;
		this.numberOfBeds = numberOfBeds;
	}


    // override reserve = if party size > beds * 2 print unavailable otherwise
    //run standard reserve
}
