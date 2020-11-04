package com.careerdevs.UI;

public class Console {

	public static void welcome(String name) {
		System.out.printf("Welcome to %s Hotel\n-----------------------\nSign the register book\n", name);
	}

	public static void horzRule() {
		System.out.print("-----------------------\n");
	}

	public static void partyCheckIn(String name) {
		System.out.print("How many guests are checking in? ");
	}

	public static void isOccupied() {
		System.out.println("Room Occupied");
	}

	public static void isAvailable() {
		System.out.println("Room Available");
	}

	public static void needsCleaning(boolean clean) {
		System.out.printf("Needs Cleaning: %b", clean);
	}

	public static void displayCurentBill(double currentBill) {
		System.out.println(currentBill);
	}

	public static void isUnavailable() {
		System.out.println("Room Unavailable");
	}

	public static void prepaying() {
		System.out.println("How much money are you prepaying? ");
	}

	public static void payOutstanding() {
		System.out.printf("\nHow are you paying of the %f that is outstandoing ");
	}

	public static void reserved() {
		System.out.print("Room reserved");
	}

	public static void roomType() {
		System.out.println("What type of room are you going to be staying in? (St)andard or (Su)ite ");
	}

}
