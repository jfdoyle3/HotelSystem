package com.careerdevs.hotelsystem.objects;

public class Room {

    private int number;
    protected String roomType;   // Array or List use instead.
    private int floor;
    protected Boolean isOccupied;
    private Boolean needsCleaning;
    protected static Client occupant;
    protected float averagePrice;   // long / double / float





    public Room(int number, String roomType, int floor, Boolean isOccupied, Boolean needsCleaning, Client occupant,
			float averagePrice) {
		super();
		this.number = number;
		this.roomType = roomType;
		this.floor = floor;
		this.isOccupied = isOccupied;
		this.needsCleaning = needsCleaning;
		this.occupant = occupant;
		this.averagePrice = averagePrice;
	}

	//   reserve = Should change room to isOccupied and assign the client to the occupant and update client bill to average price if isOccupied and needsCleaning are false otherwise print â€œunavailableâ€� Should return true if successful or false if issue.
    public static void Reserve() {

    }

    //          checkout = remove the client from object and mark isOccupied as false, set needsCleaning to true, display o outstanding balance for the client.
    public static void Checkout() {

    }
    //   clean = set needsCleaning to false
    public static void Clean(){

    }
}
