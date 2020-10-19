package com.careerdevs.hotelsystem.objects;

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
}
