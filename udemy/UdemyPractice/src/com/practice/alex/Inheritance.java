package com.practice.alex;

import javax.management.RuntimeErrorException;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Fish");
		Fish f = new Fish();
		print(f.isAlive);
		print(f.energy);
		f.eat(100);
		print(f.energy);
		f.move(20);
		print(f.energy);
		print(f.isAlive);
		print("");

		Spider s = new Spider();
		print("Spider");
		print(s.energy);
		s.eat(200);
		print(s.energy);
		s.move(45);
		print(s.energy);
		s.spinWeb(0);
		print(s.energy);
		s.move(9);
		print(s.energy);
	}

	static class Animal {
		boolean isAlive = true;
		int energy;

		void eat(int calories) {
			energy = energy + calories;
		}

		void move(int dist) {
			expend(Math.abs(dist * 4));
		}

		void expend(int calories) {
			if (isAlive) {
				energy = energy - calories;
				if (energy < 0)
					kill();
			}
			else {
				throw new RuntimeException("Dead animals can't do that");
			}
		}

		void kill() {
			isAlive = false;
		}
	}

	static class Fish extends Animal {
		@Override
		void move(int dist) {
			if (dist < 0) {
				throw new RuntimeException("Fish can't move backwards");
			}
			super.move(dist);
		}
	}

	static class Spider extends Animal {
		void spinWeb(int length) {
			expend(length * 3);
			if (length < 0)
				throw new RuntimeException("Spiders can't create negative web");

		}
	}

	static void print(Object o) {
		System.out.println(o);
	}
}
