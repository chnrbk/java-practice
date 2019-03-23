package threads;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExample extends Thread {

	static ArrayList<String> l = new ArrayList<>();

	public void run() {
		l.add("A");
		l.add("B");

	}

	public static void main(String[] args) throws InterruptedException {
		l.add("D");
		ConcurrentModificationExample cm = new ConcurrentModificationExample();
		cm.start();
		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			String e = i.next();
			System.out.println(e);
			Thread.sleep(6000);
		}
	}
}
