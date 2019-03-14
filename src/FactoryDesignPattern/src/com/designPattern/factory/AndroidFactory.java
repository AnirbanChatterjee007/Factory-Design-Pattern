package com.designPattern.factory;

import com.phone.Android;
import com.phone.Phone;

public class AndroidFactory implements PhoneFactoryInterface {
	
	private String screen;
	private String antena;
	private String simTray;
	
	public AndroidFactory(String screen,String antena,String simTray) {
		
		this.screen = screen;
		this.antena = antena;
		this.simTray = simTray;
		
	}

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		return new Android(screen,antena,simTray);
	}

}
