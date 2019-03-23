package threads;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.stream.IntStream;

public class SynchronizedDemo {
	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	volatile int  count; //will not work
	
	//int  count; //will not work

	WriteLock lc = lock.writeLock();
	public void increment(){
		lc.lock();
		count++;
		lc.unlock();
		
	}

	public static void main(String[] args) throws InterruptedException {
		SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
		synchronizedDemo.doWork();
	}

	public void doWork() throws InterruptedException {

		Thread t1 = new Thread(() -> {
			IntStream.rangeClosed(1, 10).forEach(i-> {
				//count++;
				increment();
			});
		});
		t1.setName("t1");

		Thread t2 = new Thread(() -> {
			IntStream.rangeClosed(1, 10).forEach(i -> {
				//count++;
				increment();
			});
		});

		t2.setName("t2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("count:" + count);

	}

}