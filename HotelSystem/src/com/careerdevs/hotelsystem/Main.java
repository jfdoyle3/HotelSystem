package com.careerdevs.hotelsystem;

import com.careerdevs.hotelsystem.objects.Client;
import com.careerdevs.hotelsystem.objects.Room;
import com.careerdevs.hotelsystem.objects.StandardRoom;
import com.careerdevs.hotelsystem.objects.SuiteRoom;

public class Main {

	public static void main(String[] args) {
		
		// Hotel hotel=new Hotel("Hotel Java",20,);
		
		
		Client client = new Client("Jim", 1, 1.00, .50, "555-555-5555", 101, "SuiteRoom");

		Room room = new Room(101, "Single", 1, true, false, client, 100.00);
		
		StandardRoom StandardRoom=new StandardRoom(101, "Single", 1, true, false, client, 100.00,"Single",1,1);
		
		SuiteRoom suiteRoom=new SuiteRoom(101, "Single", 1, true, false, client, 100.00,"Single",1,1,true,false);
		
		
		

	}
}
