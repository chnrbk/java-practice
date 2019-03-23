package datastructures;
/*
 * https://www.youtube.com/watch?v=0XL1NBUv2NU
 */
public class DListMain {

	public static void main(String[] args) {
		DList l = new DList(2);
		l.insertItemAtBegining(4);
		l.insertItemAtBegining(5);
		l.printList(); //exp 5 4 9
		
		System.out.println("---------adding at last---------------");
		l.insertItemAtLast(10);
		l.insertItemAtLast(12);
		l.insertItemAtLast(13);
		l.printList(); //exp 5 4 9
		
		
		System.out.println("removing elements");
		l.removeItem(4);
		l.printList(); //exp 5 4 9

		/*System.out.println("---------removing ite 4--------------");
		l.removeItem(4);
		l.printList();

		System.out.println("---------removing ite 5,2--------------");
		l.removeItem(5);
		l.removeItem(2);
		
		l.printList();

		System.out.println("---------adding at last---------------");
		l.insertItemAtLast(1);
		l.insertItemAtLast(9);
		l.insertItemAtLast(3);
		//l.printList();
		
		l.sortList();
		l.printList();*/

	}

}
