package com.perscholas.java_basics_anthony.myFirstSpring;

public class WaterMonster extends Monster {
	public WaterMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with water!";
	}
}
