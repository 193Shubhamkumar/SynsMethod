package com.example;

public class CounterThread {
	
	 protected Counter counter = null;

     public CounterThread(Counter counter){
        this.counter = counter;
     }

     public void run() {
    	 
	for(int i=0; i<10; i++)
	{
           counter.add(i);
        }
     }

//    public void start() {
//		// TODO Auto-generated method stub
//		
//	}
}

  


