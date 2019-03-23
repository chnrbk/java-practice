package threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3); // coundown from 3 to 0
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 Threads 																	// in pool
		for (int i = 0; i < 3; i++) {
			executor.submit((new CountDownLatchExample()).new Processor(latch)); // ref to latch. each time
													// call new Processes latch
													// will count down by 1
		}
		try {
			latch.await(); // wait untill latch counted down to 0
		} catch (

		InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Completed.");
		executor.shutdown();
		executor.awaitTermination(2, TimeUnit.SECONDS);
	}

	class Processor implements Runnable {
		CountDownLatch cdLatch;
		public Processor(CountDownLatch latch) {
			this.cdLatch=latch;
		}

		@Override
		public void run() {
			System.out.println("Processing- "+Thread.currentThread().getName());
			cdLatch.countDown();

		}

	}

}
