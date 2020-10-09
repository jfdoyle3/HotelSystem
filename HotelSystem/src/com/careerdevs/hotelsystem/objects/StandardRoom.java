package com.careerdevs.hotelsystem.objects;

public class StandardRoom extends Room {

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



    public StandardRoom(int number, String type, int numberOfRooms, int numberOfBeds) {
        super(numberOfBeds, type, numberOfBeds, isOccupied, occupant, averagePrice);
        this.type = type;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBeds = numberOfBeds;
    }

    
   
    // override reserve = if party size > beds * 2 print unavailable otherwise
    //run standard reserve
}
