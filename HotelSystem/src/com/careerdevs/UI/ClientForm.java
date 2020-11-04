package com.careerdevs.UI;

import com.careerdevs.hotelsystem.objects.Client;

public class ClientForm {
	
	public static Client inputClientInfo() {
		ClientConsole.clientName();
		String name=Input.inputString();
		ClientConsole.clientPhoneNumber();
		String phoneNumber=Input.inputString();
		var clientInfo=new Client(name,phoneNumber);
		return clientInfo;
	}

}
