package datastructures;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * enque (takeout from front)
 * Deque(takeout from rear)
 * -------------
 * 4, 3
 * ------
 * dequeu should return 3
 */
public class IntQueue {
	private int size;
	private int front;
	private int total;
	private int rear;
	private int q[];

	public IntQueue() {
		super();
		this.front = 0;
		this.rear = 0;
		this.total = 0;
		this.size = 10;
		this.q = new int[this.size];
	}

	public IntQueue(int size) {
		super();
		this.front = 0;
		this.rear = 0;
		this.total = 0;
		this.size = size;
		this.q = new int[this.size];
	}

	// add at back of the queue
	public boolean enqueue(int item) {
		if (!isFull(q)) {
			total++;
			q[rear] = item;
			// rear++;
			rear = (rear + 1) % size; // this is to remove the dequeued elements
			return true;
		} else {

			return false;
		}

	}

	// remove FIFO element
	public int dequeue() {
		int item = q[front];
		front = (front + 1) % size; // this is to remove the dequeued elements
		total--;
		return item;
	}

	private boolean isFull(int[] q2) {
		if (size == total)
			return true;
		return false;
	}

	public void showAll() {
		int f = front;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
				System.out.println(" " + q[f]);
				f = (f + 1) % size;
			}
		}

	}
}
