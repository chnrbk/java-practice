package nag.practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

public class ProducerAndConsumerDesignPatternDemo {

	public static void main(String[] args) {

		// Create common object
		BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>();

		// create producer and consumer threads
		Thread producerThread = new Thread(new MessageProducer(blockingQueue));
		Thread consumerThread = new Thread(new MessageConsumer(blockingQueue));
		producerThread.start();
		consumerThread.start();
		
	}

}

	class MessageConsumer implements Runnable{
		
		private BlockingQueue<?> blockingQueue;

		public MessageConsumer(BlockingQueue blockingQueue) {
			this.blockingQueue = blockingQueue;
		}

		@Override
		public void run() {

			try {
				while(true){
					System.out.println("Received from Consumer:"+blockingQueue.take());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

