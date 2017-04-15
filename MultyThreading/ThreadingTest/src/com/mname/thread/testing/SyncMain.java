package com.mname.thread.testing;

public class SyncMain {
	public static void main(String[] args) {
		Callme target = new Callme();

		Caller ob1 = new Caller("Добро пожаловать", target);
		Caller ob2 = new Caller("Волшебный мир", target);
		Caller ob3 = new Caller("В этот чудный", target);

		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Прерванно");
		}

	}
}
