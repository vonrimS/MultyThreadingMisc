package com.mname.thread.testing;

public class DemoJoin {

	public static void main(String[] args) {
		NewThread obj1 = new NewThread("One");
		NewThread obj2 = new NewThread("Two");
		NewThread obj3 = new NewThread("Three");

		System.out.printf("Поток \"%s\" запущен. Статус активен? =%s\n", obj1.name, obj1.thread.isAlive());
		System.out.printf("Поток \"%s\" запущен. Статус активен? =%s\n", obj2.name, obj2.thread.isAlive());
		System.out.printf("Поток \"%s\" запущен. Статус активен? =%s\n", obj3.name, obj3.thread.isAlive());

		try {
			System.out.println("Ожидание завершения потоков...");
			obj1.thread.join();
			obj2.thread.join();
			obj3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван...");
		}

		System.out.printf("\nПоток \"%s\" завершен. Статус активен? =%s\n", obj1.name, obj1.thread.isAlive());
		System.out.printf("Поток \"%s\" завершен. Статус активен? =%s\n", obj2.name, obj2.thread.isAlive());
		System.out.printf("Поток \"%s\" завершен. Статус активен? =%s\n", obj3.name, obj3.thread.isAlive());

		System.out.println("\nГлавный поток завершен!");
	}

}