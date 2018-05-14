package nag.practice;

public interface Interface1 {
	
	default void method1(){
		System.out.println("method1");
		
	}
	 void method2();

		default void method3(){
			System.out.println("method1");
			  
		}
}
