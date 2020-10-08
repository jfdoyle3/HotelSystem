package com.careerdevs.hotelsystem.objects;

public class SuiteRoom {
    //  inherents ROOM
//    {
//    private int number;
//    private String roomType;   // Array or List use instead.
//    private int floor;
//    private Boolean isOccupied;
//    private Boolean needsCleaning;
//    private Client occupant;
//    private int averagePrice;   // long / double / float
//}

    private String type; // Array or List use instead.
    private int numberOfRooms;
    private int numberOfBeds;
    private Boolean kitchenette;
    private Boolean needsRestock;
	public SuiteRoom(String type, int numberOfRooms, int numberOfBeds, Boolean kitchenette, Boolean needsRestock) {
		super();
		this.type = type;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBeds = numberOfBeds;
		this.kitchenette = kitchenette;
		this.needsRestock = needsRestock;
	}
    
  

  //  override reserve = include a check on needsRestock then run standard reserve.

 //   override checkout = set needsRestock to true run standard checkout.

  //          restock() = set needs restock to false
}
