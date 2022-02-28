package com.perscholas.java_basics_anthony.myFirstSpring;

public class StoneMonster extends Monster {
	public StoneMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with stone!";
	}
}
