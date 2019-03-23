package javacodegeeks.com;

import java.util.Scanner;

public class FindNthElementINLinkedList {
	
	Node head;
	int x;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in node char(13)");
		int n = sc.nextInt();
		

		System.out.println("Enter Nth element to find in the list");
		int k = sc.nextInt();
		
		System.out.println("Enter elements of the linked list one by one in new line");
		FindNthElementINLinkedList llist = new FindNthElementINLinkedList();
		for(int i=0;i<n;i++){
			int element = sc.nextInt();
			Node node = new Node(element);
			llist.addNodeToListAtEnd(node);
		}
		int nthlement = llist.findNthElement(llist.head,k);
		System.out.println(nthlement);
		
	}
	
	private int findNthElement(Node head, int k) {

		int count = 0;
		Node p =head;
		while (p != null) {
			p = p.next;
			count++;
		}
		int x = count - k;
		if (k > count) {
			return -1;
		} else {
			while (x-- > 0) {
				head = head.next;
			}
			return head.data;
		}
	}

	public void addNodeToListAtEnd(Node node){
		if(head ==null){
			head=node;	
		}
		else{
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
				temp.next=node;
		}
		
	}
}
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

