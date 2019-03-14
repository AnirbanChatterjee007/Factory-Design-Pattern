package com.phone;

public class Iphone extends Phone {
	
	private String screen;
	private String antena;
	private String simTray;

public Iphone(String screen,String antena,String simTray) {
		
		this.screen = screen;
		this.antena = antena;
		this.simTray = simTray;
		
	}

	@Override
	public String getScreen() {
		// TODO Auto-generated method stub
		return this.screen;
	}

	@Override
	public String getAntena() {
		// TODO Auto-generated method stub
		return this.antena;
	}

	@Override
	public String getSimTray() {
		// TODO Auto-generated method stub
		return this.simTray;
	}
}
