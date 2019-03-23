package datastructures;

import java.util.LinkedList;
import java.util.List;

/*
 * array of linked list
 * arr[0] =new LinedList<Node>
 */
public class MyHashMap<K, V> {

	int size;
	List<Node>[] arr;

	public MyHashMap(int size) throws IllegalArgumentException {
		if (size == 0)
			throw new IllegalArgumentException();
		this.size = size;
		// creating an array of List
		this.arr = new List[this.size];
		for (int i = 0; i < size; i++)
			arr[i] = new LinkedList<Node>();
	}

	public void put(K key, V value) {
		if (key == null) {
			throw new IllegalArgumentException();
		}
		int index = Math.abs(key.hashCode()) % this.size; // hascode divided by
															// size

		List<Node> list = arr[index];
		for (Node n : list) {
			if (n.key.equals(key)) {
				n.val = value;
				return;
			}
		}

		Node newNode = new Node(key, value);
		list.add(newNode);
		/*
		 * if (n.previous != null) { n.previous.next = n; }
		 */
	}

	public V get(K key) {
		if (key == null) {
			throw new IllegalArgumentException();
		}
		int index = Math.abs(key.hashCode()) % this.size; // hascode divided by
															// size
		List<Node> l = arr[index];
		for (Node n : l) {
			if (n.key.equals(key)) {
				return n.val;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		MyHashMap<Integer, Integer> hashMap = new MyHashMap<>(10);
		hashMap.put(1, 4);
		hashMap.put(2, 5);
		hashMap.put(3, 7);
		System.out.println("HashMap:" + hashMap.size());
		System.out.println(hashMap.get(1));

	}

	private int size() {

		return arr.length;
	}

	class Node {
		K key;
		V val;
		Node next;
		Node previous;

		public Node(K key, V value) {

			this.key = key;
			this.val = value;
			next = null;
			previous = null;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Key=" + this.key + "Value=" + val;
		}

	}

	@Override
	public String toString() {

		for (List<Node> l : arr) {
			l.stream().forEach(a -> System.out.println(a.key + "=" + a.val));
		}
		return super.toString();
	}

}
