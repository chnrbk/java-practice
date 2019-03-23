package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

public class BlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		

		BlockingQueue sharedQueue = new ArrayBlockingQueue<>(30);
		Thread prodThread = new Thread(new Producer(sharedQueue));
	    Thread consThread = new Thread(new Consumer(sharedQueue));
	    prodThread.start();
	    consThread.start();
		
	}

}

class Producer implements Runnable {
	BlockingQueue blockingQueue;

	public Producer(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	public void produce(){
		IntStream.rangeClosed(1, 10).forEach(a->{
			System.out.println("Produced-> Hi-"+a);
			try {
				blockingQueue.put(a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		;
	}
	@Override
	public void run() {
		produce();
	}
}

class Consumer implements Runnable {
	BlockingQueue<Object> blockingQueue;
	
	public Consumer(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	public void consume(){
		IntStream.rangeClosed(1, 10).forEach(a->{
		Object o = null;
		try {
			o = blockingQueue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Received:"+o.toString());
		});
	}
	@Override
	public void run() {
		consume();
	}
}
