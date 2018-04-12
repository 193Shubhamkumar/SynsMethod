package com.example;

public class Counter {
	
	long count = 0;
	
	public synchronized void fun(long value) {
		this.count = +value;
	}

	public void add(int i) {
		// TODO Auto-generated method stub
		
	}

}
