package com.perscholas.java_basics_anthony.myFirstSpring;

public class MonsterHandler {

	public void handleMonsters(Monster[] monsters) {
		for (Monster monster: monsters) {
			System.out.println(monster.attack());
		}
	}
}
