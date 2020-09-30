package com.careerdevs.hotelsystem.objects;

public class Room {

    private int number;
    private String roomType;   // Array or List use instead.
    private int floor;
    private Boolean isOccupied;
    private Boolean needsCleaning;
    private Client occupant;
    private int averagePrice;   // long / double / float


 //   reserve = Should change room to isOccupied and assign the client to the occupant and update client bill to average price if isOccupied and needsCleaning are false otherwise print “unavailable” Should return true if successful or false if issue.

  //          checkout = remove the client from object and mark isOccupied as false, set needsCleaning to true, display o outstanding balance for the client.

 //   clean = set needsCleaning to false

}
