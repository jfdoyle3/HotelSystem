package com.careerdevs.hotelsystem.objects;

public class Hotel extends Rooms{

    // inherents{
    // Standard Rooms{
    //  private int availableStandards;
    //private int reservedStandards;
     //}
    //
    // Suites
    //  private int availableSuite;
    //private int reservedSuite;

    private Client client;
    private String name;
    private int rooms;
    
    
	public Hotel(Client client, String name, int rooms) {
		super();
		this.client = client;
		this.name = name;
		this.rooms = rooms;
	}



 //   addRoom = add either a standard or suite to appropriate collection
	

  //          reserveRoom = pull a room from the correct list. if empty print ‘unavailable’ otherwise, run the checkout for the room and move the room from available to reserved. Using the correct collection will make this easier. Add client to clients list

  //          checkoutRoom = run the checkout process for a room and move the room from reserved to available.

 //   getClientBalance = get the balance of a client by either their room number or name
}
