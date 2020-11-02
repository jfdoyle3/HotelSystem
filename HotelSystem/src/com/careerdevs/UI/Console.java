package com.careerdevs.UI;

public class Console {

	public static void isOccupied() {
		System.out.println("Room Occupied");
	}

	public static void isAvailable() {
		System.out.println("Room Available");
	}

	public static void needsCleaning(boolean clean) {
		System.out.printf("Needs Cleaning: %b",clean);
	}
	public static void displayCurentBill(double currentBill) {
		System.out.println(currentBill);
	}
	public static void isUnavailable() {
		System.out.println("Room Unavailable");
	}
	
}
