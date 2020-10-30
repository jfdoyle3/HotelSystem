package com.careerdevs.UI;

import java.util.Scanner;

public class Input {
	private static Scanner input=new Scanner(System.in);
	
	public static double GetPrepaid() {
		System.out.println("How much money are you prepaying? ");
		return input.nextDouble();
	}
	
	public static double MakePayment(double outstanding) {
		System.out.printf("\nHow are you paying of the %f that is outstandoing ");
		return input.nextDouble();
	}
}
