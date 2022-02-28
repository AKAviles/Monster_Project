package com.perscholas.java_basics_anthony.myFirstSpring;

public class FireMonster extends Monster{

	public FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with fire!";
	}
}
