package nag;

public class SubClassTest extends SuperClass {

	public static void main(String[] args) {

		SuperClass superClass = new SubClassTest();
		superClass.method1();
		superClass.v1 = 1;
		superClass.method1();
		superClass.privateMethod1();
		SubClassTest subClass = new SubClassTest();
		System.out.println("a+b "+subClass.add(2, 3));
		SubClassTest subClasssubClass1 = new SubClassTest();
		System.out.println("a+b+c "+subClasssubClass1.add(2, 3,4));
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	public int add(int a, int b) {
		System.out.println("from sublcass add");
		return a + b ;
	}
	
	protected void exceptionMethod() throws Exception{
		System.out.println("Exception from subclass");
	}
}