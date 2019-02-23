package com.application;

import java.util.ArrayList;
import java.util.List;

public class AppData 
{

	public static  List<Applications> getAppInformation() 
	
	{ 
		List<Applications> myApp = new ArrayList<>();
		
		
		  //Applications temp = new Applications("Logo Maker","Art and Design",5000,5);
		 // myApp.add(temp);
		// temp.add("","",value,value);
		
		
		myApp.add(new Applications("Logo Maker","Art and Design",5000,5));
		myApp.add(new Applications("Police Detector","Auto and Vehicle",10000,7));
		myApp.add(new Applications("Cute Press","Beauty",500,3));
		myApp.add(new Applications("Sky Map","Book and Reference",2500,4));
		myApp.add(new Applications("Career24","Business",90000,8));
		myApp.add(new Applications("Extreme Car","Comics",7000,6));
		
		
		
		
		return myApp;
		
		
	}

}
