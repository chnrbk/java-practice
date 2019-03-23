import java.util.*;

class MyMap<K, V> {
	class Node {
		K key;
		V val;

		private Node(K key, V val) {
			this.key = key;
			this.val = val;
		}
	}

	int size;
	List<Node>[] arr;

	public MyMap(int size) throws IllegalArgumentException {
		if (size == 0)
			throw new IllegalArgumentException();
		this.size = size;
		// creating an array of List
		this.arr = new List[this.size];
		for (int i = 0; i < size; i++)
			arr[i] = new ArrayList<Node>();
	}

	public MyMap() {
		this.size = 50;
		// creating an array of List
		this.arr = new List[this.size];
		for (int i = 0; i < size; i++)
			arr[i] = new ArrayList<Node>();
	}

	// put method to put a (key,value) pair
	public synchronized void put(K key, V val) throws IllegalArgumentException {
		if (key == null)
			throw new IllegalArgumentException();
		int index = Math.abs(key.hashCode()) % this.size;
		List<Node> list = arr[index];
		for (Node n : list) {
			if (n.key.equals(key)) {
				n.val = val;
				return;
			}
		}
		list.add(new Node(key, val));
	}

	// get method to get the value for a corresponding key
	public synchronized V get(K key) throws IllegalArgumentException {
		if (key == null)
			throw new IllegalArgumentException();
		int index = Math.abs(key.hashCode()) % this.size;
		List<Node> list = arr[index];
		for (Node n : list) {
			if (n.key.equals(key)) {
				return n.val;
			}
		}
		return null;
	}

	// delete method to delete a (key,value) pair from the map
	public synchronized void delete(K key) throws IllegalArgumentException {
		if (key == null)
			throw new IllegalArgumentException();
		int index = Math.abs(key.hashCode()) % this.size;
		List<Node> list = arr[index];
		for (Node n : list) {
			if (n.key.equals(key)) {
				list.remove(n);
				return;
			}
		}
		System.out.println("Key not found");
	}

	// exist method to check if a key exists in the map or not
	public synchronized boolean exist(K key) throws IllegalArgumentException {
		if (key == null)
			throw new IllegalArgumentException();
		int index = Math.abs(key.hashCode()) % this.size;
		List<Node> list = arr[index];
		for (Node n : list) {
			if (n.key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IllegalArgumentException {
		// check the exception thrown
		// MyMap<String,String> map = new MyMap<String,String>(0);
		MyMap<String, String> map = new MyMap<String, String>();
		map.put("dummy key", "dummy value");
		// Test get
		System.out.println(map.get("dummy key"));
		System.out.println(map.get("non existent key"));
		// Test exist
		System.out.println(map.exist("dummy key"));
		System.out.println(map.exist("does not exist"));
		// Test delete
		map.delete("dummy key");
		System.out.println(map.get("dummy key"));
	}
}
