package datastructures;

import nag.practice.Person;

public class BSTMain {

	public static void main(String[] args) {
		Person p1 = new Person("Aaba", 24);
		Person p2 = new Person("Caca",34);
		Person p3 = new Person("Baba",10);
		Person p4 = new Person("Daka",55);

		BST bst = new BST();

		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.showAll(bst.findNode("Baba"));

	}

}
