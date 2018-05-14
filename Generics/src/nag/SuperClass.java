package nag;

public class SuperClass {
	
	public int v1;
	public void method1(){
		System.out.println("super method 1 called: "+v1);
	}
	
	protected void privateMethod1(){
		System.out.println("private method 1 from super:"+v1);
	}
	
	protected int add(int a,int b){
		return a+b;
	}
	
	protected void exceptionMethod(int a,int b){
		System.out.println("Exception method from super");
	}

}
