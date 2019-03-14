package com.designPattern.factory;

import com.phone.Android;
import com.phone.Phone;

public class FactoryClient {

	public static void main(String[] args) {
		
		Phone newAndroidPhone = 
				com.designPattern.factory.ComputerFactory.phoneCreator(new AndroidFactory("androidScreen","androidAntena","androidsimTray"));
		// TODO Auto-generated method stub
		
		System.out.println("phone is :" +newAndroidPhone);

	}

}
;