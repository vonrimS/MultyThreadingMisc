package com.mname.thread.testing;

public class NewThread implements Runnable {

	String name;
	Thread thread;

	public NewThread(String name) {
		this.name = name;
		thread = new Thread(this, name);
		System.out.println("Новый поток " + thread);
		thread.start();
	}

	// точка входа в поток исполнения
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);// ожидание 1 сек
			}
		} catch (InterruptedException e) {
			System.out.println("Поток " + name + " прерван...");
		}
		System.out.println("Поток " + name + " завершен.");
	}

}
