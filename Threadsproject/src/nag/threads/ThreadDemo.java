package nag.threads;

public class ThreadDemo implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread( new ThreadDemo());
		t1.setName("First Thread");
		t1.start();	
		Thread t2 = new Thread( new ThreadDemo());
		t2.setName("Second Thread");;
		t2.start();	
	}

	@Override
	public void run() {
		
		System.out.println("Current Thread-1:"+Thread.currentThread().getName()+"\t ; Thread state:"+Thread.currentThread().getState());	

		try {
			Thread.currentThread();
			Thread.sleep(9000);
		//	System.out.println("Current Thread-2:"+Thread.currentThread().getName()+"\t ; Thread state:"+Thread.currentThread().getState());	

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Current Thread 3:"+Thread.currentThread().getName()+"\t ; Thread state:"+Thread.currentThread().getState());	

	}

}
