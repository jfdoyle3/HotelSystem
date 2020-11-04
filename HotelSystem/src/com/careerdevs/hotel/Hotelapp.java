package com.careerdevs.hotel;

import com.careerdevs.UI.ClientForm;
import com.careerdevs.UI.Console;
import com.careerdevs.UI.Input;
import com.careerdevs.hotelsystem.objects.Client;
import com.careerdevs.hotelsystem.objects.Hotel;

public class Hotelapp {

	public static void Hotel() {
		Hotel hotel=new Hotel("Summit",20);
		Console.welcome(hotel.getHotelName());
		Client clientInfo=ClientForm.inputClientInfo();
		Console.horzRule();
		

		
		System.out.println(clientInfo.getName());
		System.out.println(clientInfo.getPhoneNumber());
		
		
			
		
		
		
		
		

		
		
//				
//		
//				Client client = new Client("Jim", 1, 1.00, .50, "555-555-5555", 101, "SuiteRoom");
//
//				Room room = new Room(101,"Single", 100.00);
//				
//				StandardRoom StandardRoom=new StandardRoom(101,100.00,1,1);
//				
//				SuiteRoom suiteRoom=new SuiteRoom(101, 100.00,1,1,true,false);
	}
}
