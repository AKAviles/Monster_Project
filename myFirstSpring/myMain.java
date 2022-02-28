package com.perscholas.java_basics_anthony.myFirstSpring;

public class myMain {

	public static void main(String[] args) {
//		Monster m1 = new FireMonster("r2u2");
//		Monster m2 = new WaterMonster("u2r2");
//		Monster m3 = new FireMonster("u2r2");

//		System.out.println(m1.attack());
//		System.out.println(m2.attack());
//		System.out.println(m3.attack());

		Monster[] monsters = {new FireMonster("r2u2"),
				new WaterMonster("u2r2"),
				new FireMonster("u2r2"),
				new StoneMonster("a2b2"),
				new CookieMonster("Cookie")
		};



		MonsterHandler monsterHandler = new MonsterHandler();
		monsterHandler.handleMonsters(monsters);

//		m1 = new StoneMonster("a2b2");
//		System.out.println(m1.attack());

//		Monster m4 = new Monster("u2u2");
//		System.out.println(m4.attack());


	}
}
