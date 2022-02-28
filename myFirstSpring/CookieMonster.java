package com.perscholas.java_basics_anthony.myFirstSpring;

public class CookieMonster extends Monster {
	public CookieMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attacked with cookies!";
	}
}
