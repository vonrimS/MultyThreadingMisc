package com.mname.thread.testing;

public class Caller implements Runnable {

	String msg;
	Callme targetCall;
	Thread t;

	public Caller(String msg, Callme targetCall) {
		this.msg = msg;
		this.targetCall = targetCall;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		targetCall.call(msg);
	}

}
