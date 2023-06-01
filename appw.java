package pp2;

public class app {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		worker worker = new worker();
		Thread t1 = new Thread();
		t1.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		worker.setTerminated(true);
		System.out.println("Finished...");

	}
}
