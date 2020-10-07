package com.careerdevs.hotelsystem.objects;

public class Client {

    private String name;
    private String firstName;
    private String lastName;
    private String group;
    private int currentBill;    //long / double / float
    private int prepaid;        // long /double / float
    private String phoneNumber;   // split("-")
    private int roomNumber;
    private String roomType;   // Array or List use instead.

    public Client(String firstName, String lastName, String group, int partySize, int currentBill, int prepaid, String phoneNumber, int roomNumber, String roomType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.currentBill = currentBill;
        this.prepaid = prepaid;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

  //  makePayment = increase prepaid
    public static void MakePayment(){

    }
  //  chargeRoom = increase current bill
    public static void ChargeRoom(){

    }
  //          getOustanding = get outstanding balance.

    public static void GetOutstandng(){

    }

    }

