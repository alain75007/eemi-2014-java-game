// Fichier Game.java
package com.myschool.game.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.myschool.game.core.Archer;
import com.myschool.game.core.Character;
import com.myschool.game.core.Warrior;

public class Game {

	public static void main(String[] args) {
		Archer character3 = null;
		Warrior character1   = new Archer("Maxime");
		//Archer  character3 = new Archer("Ryan");
		Character character2 = new Character("Juan");
		character1.setName("Maxime");
		character2.setName("Alpha");
		System.out.println("Nombre de personnages : " + Character.getPlayerCount());
		/*		character2.disBonjour();
		character1.disBonjour(character2);
		character1.disBigger();
		character3.disBonjour();

		character3.getWeapon();
		character3.fight();
		character3.fight();
		character3.fight();
		character3.rangerWeapon();*/

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String cmd = null;

		System.out.println("Entrer votre nom");
		while (cmd == null || cmd.isEmpty() || !cmd.equals("exit")) {
			try {
				cmd = in.readLine();
				if (character3 == null) {
					if (cmd != null && !cmd.isEmpty()) {
						character3 = new Archer(cmd);
						character3.disBonjour();
					}
					else {
						System.out.println("Entrer votre nom");
					}
				}
				else {
					//System.out.println(cmd);
					switch (cmd) {
					case "h":  {
						character3.disBonjour();
					}
					break;
					case "gw":  {
						character3.getWeapon();
					}
					break;
					case "f":  {
						character3.fight();
					}
					break;
					case "exit": ;
					break;

					default: character3.dit("Commande " + cmd + " not found");
					break;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Exit game");

	}

}

