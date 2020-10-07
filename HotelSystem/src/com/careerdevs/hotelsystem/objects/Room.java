package com.careerdevs.hotelsystem.objects;

public class Room {

    private int number;
    private String roomType;   // Array or List use instead.
    private int floor;
    private Boolean isOccupied;
    private Boolean needsCleaning;
    private Client occupant;
    private int averagePrice;   // long / double / float

    public Room(int number) {
        this.number=number;
    }



    //   reserve = Should change room to isOccupied and assign the client to the occupant and update client bill to average price if isOccupied and needsCleaning are false otherwise print “unavailable” Should return true if successful or false if issue.
    public static void Reserve() {

    }

    //          checkout = remove the client from object and mark isOccupied as false, set needsCleaning to true, display o outstanding balance for the client.
    public static void Checkout() {

    }
    //   clean = set needsCleaning to false
    public static void Clean(){

    }
}
