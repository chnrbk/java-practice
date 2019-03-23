package threads;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.stream.IntStream;

public class LockExample {
	static int count;

	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public static void main(String[] args) throws InterruptedException {
		MyTask t = new MyTask();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		t2.start();
		/*t1.join();
		t2.join();*/
		System.out.println(count);
	}

	static class MyTask implements Runnable {
		private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		WriteLock l  = lock.writeLock();

		
		@Override
		public void run() {
			l.lock();
			System.out.println("MyTask: by Thread"+Thread.currentThread().getName());
			IntStream.rangeClosed(1, 10).forEach((i->count++));
			System.out.println(count);
			l.unlock();

		}
	}

}
