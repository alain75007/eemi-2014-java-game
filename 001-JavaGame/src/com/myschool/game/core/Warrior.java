package com.myschool.game.core;

public abstract class Warrior extends Character implements Fight {

	public Warrior(String name) {
		super(name, 20);
	}

	@Override
	public void disBonjour(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour les civils! Je suis un " + this.getClass().getSimpleName());
	}

	public void disBigger() {
		this.dit(this.getName()  + " dit : JE SUIS LE PLUS FORT!!!!");
	}


}
