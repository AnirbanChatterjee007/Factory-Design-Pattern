package com.phone;

public abstract class Phone {

	public abstract String getScreen();
	public abstract String getAntena();
	public abstract String getSimTray();
	
	
	public String toString() {
		
		return this.getScreen() + this.getAntena() + this.getSimTray();
	}
	
	
}
