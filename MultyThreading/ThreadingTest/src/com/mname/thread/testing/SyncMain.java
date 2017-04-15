package com.mname.thread.testing;

public class SyncMain {
	public static void main(String[] args) {
		Callme target = new Callme();

		new Caller("Добро пожаловать", target);
		new Caller("В этот чудный", target);
		new Caller("Волшебный мир", target);

	}
}
