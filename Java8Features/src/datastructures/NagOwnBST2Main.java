package datastructures;

public class NagOwnBST2Main{
	public static void main(String[] args) {
		NagOwnBST b = new NagOwnBST(10);
		b.insert(3);
		b.insert(2);
		b.insert(77);
		b.insert(9);
		b.showAll(b.findNode(10));
		
	}
	
}
