package datastructures;


import datastructures.IntLinkedList.Node;

//head -> single linked list

public class DList {
	private Node head; // global for list,1st element

	public DList(int item) {
		head = new Node();
		head.value = item;
		head.next = null; 
		head.prev = null;
	}

	// add after header
	// header -node 1-> node 2----
	// here node 1 is inserted
	// every time a new item is inserted, it is inserted at begining
	public boolean insertItemAtBegining(int item) {
		Node n = new Node();
		n.value = item;
		n.next=head;
		n.prev=null;
		head.prev=n;
		head=n;
	
		return true;
	}
	
	// insert at the bottom of the item
	public boolean insertItemAtLast(int item) {

		// if no head first create it
		if (head == null) {
			head = new Node();
			head.value = item;
			head.next = null;
			head.prev = null;
			return true;
		}
		Node n = new Node();
		n.value = item;
		Node t;
		t = head;
		while (t.next != null) {
			t = t.next;
		}
		n.next = null;
		n.prev=t;
		t.next = n;
		return true;

	}

	// we need first Node to start iterate
	public void printList() {
		Node z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.next;
		}
	}
	// 2 ,4, 5
	// let say remove 4, so take link of 4 and put it in temp

	public boolean removeItem(int item) {
		// check if header contains the value
		if (head.value == item) {
			head = head.next;
			return true;
		} else {
			Node x = head;
			Node y = head.next;
			while (true) {

				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}
			// means we found it
			if (y != null) {
				x.next = y.next;
				return true;

			} else {
				return false;
			}
		}
	}
	/*
	// bubble sort, shift
	public void sortList() {
		int c = 0;
		Node a = head;
		while (a.link != null) {
			Node b = head;
			while (b.link != null) {
				if (b.value > b.link.value) {
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}

	}*/

	class Node {
		
		private Node prev;
		private int value;
		private Node next;

	}
}
