package com.careerdevs.hotelsystem.objects;

public class SuiteRoom extends Room {

	private String type; // Array or List use instead.
	private int numberOfRooms;
	private int numberOfBeds;
	private Boolean kitchenette;
	private Boolean needsRestock;

	public SuiteRoom(int roomNumber, String roomType, int floor, Boolean isOccupied, Boolean needsCleaning,
			Client occupant, double averagePrice, String type, int numberOfRooms, int numberOfBeds, Boolean kitchenette,
			Boolean needsRestock) {
		super(roomNumber, roomType, floor, isOccupied, needsCleaning, occupant, averagePrice);
		this.type = type;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBeds = numberOfBeds;
		this.kitchenette = kitchenette;
		this.needsRestock = needsRestock;
	}
	
	// override reserve = include a check on needsRestock then run standard reserve.

	// override checkout = set needsRestock to true run standard checkout.

	// restock() = set needs restock to false
}
