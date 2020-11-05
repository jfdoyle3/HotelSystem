package com.careerdevs.UI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.careerdevs.hotelsystem.objects.Client;

public class ClientForm {

	public static Client inputClientInfo() {

		ClientConsole.clientName();
		String name = Input.inputString();
		String phoneNumber = validate();
		var clientInfo = new Client(name, phoneNumber);
		return clientInfo;

	}

	private static String validate() {
		String phoneNumber = "";
		boolean validInput = false;
		do {
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				ClientConsole.clientPhoneNumber();
				phoneNumber = input.readLine();
				if (phoneNumber.matches("((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}"))
					validInput = true;
			} catch (Exception e) {
				System.out.println("" + e);
			}
		} while (!validInput);
		return phoneNumber;
	}

}
