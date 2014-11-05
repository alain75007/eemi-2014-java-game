//Fichier Character.java
package com.myschool.mygame.javagame.core;

public class Character {
	private static int playerCount;
	public Character(String name) {
		this.setName(name);
		playerCount++;
	}
	public Character(String name, int livePoint) {
		this.setName(name);
		this.livePoint = livePoint;
	}
	private String name;
	private int livePoint;
	public void setLiveScore(int liveScore) {
		this.setLivePoint(liveScore);
   }
	public void getLiveScore() {
		this.getLivePoint();
	}
	public void disBonjour(Character character) {
		dit("Bonjour " + character.getName() + "!");
   }
	public void disBonjour() {
		dit(": Bonjour tout le monde!");
   }
	public int getLivePoint() {
		return livePoint;
	}
	public void setLivePoint(int livePoint) {
		this.livePoint = livePoint;
	}
	public static int getPlayerCount() {
		// TODO Auto-generated method stub
		return Character.playerCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void dit(String string) {
		System.out.println(this.getName() + " dit: " + string);
		// TODO: à faire
	}
}
