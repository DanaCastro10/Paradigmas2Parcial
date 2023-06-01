package com.pp2;

public class Runner2 implements Runnable {
	
	
	public void run (){
		for(int i=0; i<10;i++) {
			System.out.println("RUNNER 2: "+ i);
		}
	}
}

