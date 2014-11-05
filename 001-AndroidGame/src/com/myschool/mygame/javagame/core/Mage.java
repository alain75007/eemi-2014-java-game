package com.myschool.mygame.javagame.core;

public class Mage extends Warrior  {
	protected int arrowCount = 2;
	protected boolean weaponInUse = false;
	protected boolean hasWeapon = true;
	public Mage(String name) {
		super(name);
	}

	public void disBonjour() {
		dit("Je suis le plus habile des archer");
	}

	protected void getArrow() {
		if (arrowCount > 0 ) {
			dit("Je prends une flèche");
		}
	}
	
	public void getWeapon() {
		if (weaponInUse || !hasWeapon)  return;
			dit("Je prends mon arc");
			weaponInUse = true;

	}



	public void rangerWeapon() {
		if (hasWeapon) dit("Je remets mon arc à l'épaule");

	}


	public void fight() {
		if (hasWeapon) {
			getWeapon();
			if (arrowCount > 0) {
				getArrow();
				dit("Je tire la flèche");
				arrowCount--;
			}
			else {
				// TODO et si l'ardversaire est trop prêt?
				dit("Je lance mon arc à la tête de mon adversaire");
				hasWeapon = false;
			}
		}
		else {
			dit("Je m'enfuis!!!");
		}
	}


}

