package com.careerdevs.hotelsystem.objects;

public class SuiteRoom extends Room {

	private int numberOfRooms;
	private int numberOfBeds;
	private Boolean kitchenette;
	private Boolean needsRestock;

	public SuiteRoom(int roomNumber,double averagePrice, int numberOfRooms, int numberOfBeds, Boolean kitchenette,Boolean needsRestock) {
		super(roomNumber,"Suite", averagePrice);
		this.numberOfRooms = numberOfRooms;
		this.numberOfBeds = numberOfBeds;
		this.kitchenette = kitchenette;
		this.needsRestock = needsRestock;
	}
	
	// override reserve = include a check on needsRestock then run standard reserve.
	public void reserve() {
		boolean reservedRoom = false;
		if (reservedRoom) {
			System.out.println("reserve room");
		}
	}
	
	// override checkout = set needsRestock to true run standard checkout.
	public boolean checkOut() {
		return true;
	}
	// restock() = set needs restock to false
	public boolean restock() {
		return false;
	}
}
