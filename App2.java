package com.pp2;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1= new Thread(new RUNNER1PT2 ());
		Thread t2= new Thread(new RUNNER2PT2 ());
		
		t1.start();
		t2.start();

	}

}
