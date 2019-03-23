package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class TestExecutors {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 24, 53, 4, 23, 43, 43, 342, 24, 242, 23, 23);
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		//new ThreadPoolExecutor(9, 27, 90, TimeUnit.SECONDS, new SynchronousQueue() );

		
		Runnable taskFull = new Runnable() {
		ReentrantReadWriteLock rlock = new ReentrantReadWriteLock();
		WriteLock	lock = rlock.writeLock();

			@Override
			public void run() {
				lock.lock();
				intList.stream().forEach(n -> System.out.println("" + Thread.currentThread().getName() + "--" + n));
				lock.unlock();
			}
		};

		Thread t1 = new Thread(taskFull);
		t1.start();
		Thread t2 = new Thread(taskFull);
		t2.start();
		
		//
		/*threadPool.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("test execute1");
			}

		});
		threadPool.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("test execute2");
			}

		});
		threadPool.shutdown();*/

		// threadPool.execute(System.out::println);
	}

}
