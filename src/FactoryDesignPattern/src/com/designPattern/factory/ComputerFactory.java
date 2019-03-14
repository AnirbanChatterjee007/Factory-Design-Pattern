package com.designPattern.factory;


import com.phone.Phone;

public class ComputerFactory {
	
	public static Phone phoneCreator( PhoneFactoryInterface phone ) {
		return phone.makePhone();
	}
}
