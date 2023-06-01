package hilos;

public class MultiHola {

	    public static void main( String args[] ) {
	        TestTh t1,t2,t3;

	        
	        t1 = new TestTh( "Hilo=Thread 1",(int)(Math.random()*2000) );
	        t2 = new TestTh( "Hilo=Thread 2",(int)(Math.random()*2000) );
	        t3 = new TestTh( "Hilo=Thread 3",(int)(Math.random()*2000) );
	        
	        t1.start();
	        t2.start();
	        t3.start();
	        }
	    }

