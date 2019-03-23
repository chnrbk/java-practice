package nag.practice;

import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

class MessageProducer implements Runnable {

	private BlockingQueue blockingQueue;

	public MessageProducer(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		
		IntStream.rangeClosed(1, 1000).forEach(i->{
			try {
				blockingQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		System.out.println("put message in producer");
		
	}
}