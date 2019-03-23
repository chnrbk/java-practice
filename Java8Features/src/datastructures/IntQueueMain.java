package datastructures;

public class IntQueueMain {

	public static void main(String[] args) {
		IntQueue queue = new IntQueue();
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println(queue.dequeue());
	//	System.out.println(queue.dequeue());
		queue.showAll();
	}

}
