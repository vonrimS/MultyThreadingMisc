package com.mname.thread.testing;

public class NewTypicalThread implements Runnable {

	String threadName;
	Thread newlyCreatedThread;

	public NewTypicalThread(String threadName) {
		this.threadName = threadName;
		newlyCreatedThread = new Thread(this, threadName);
		System.out.println("Новый поток : " + newlyCreatedThread);
		newlyCreatedThread.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(threadName + " : " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println(threadName + " был прерван");
		}

		System.out.println("поток" + threadName + " был завершен");

	}

}
