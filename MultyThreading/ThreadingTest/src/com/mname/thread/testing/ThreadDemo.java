package com.mname.thread.testing;

public class ThreadDemo {

	public static void main(String[] args) {
		// creating some threads to test
		for (int i = 1; i < 4; i++) {
			String nameSrc = "Поток " + i;
			new NewTypicalThread(nameSrc);
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Главный поток завершен");
	}

}
