package com.designPattern.factory;

import com.phone.Iphone;
import com.phone.Phone;

public class IphoneFactory implements PhoneFactoryInterface {
	
	private String screen;
	private String antena;
	private String simTray;
	
	public IphoneFactory(String screen,String antena,String simTray) {
		
		this.screen = screen;
		this.antena = antena;
		this.simTray = simTray;
		
	}

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		return new Iphone(screen,antena,simTray);
	}

	
}
