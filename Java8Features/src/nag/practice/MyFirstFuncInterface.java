package nag.practice;

@FunctionalInterface
public interface MyFirstFuncInterface {
	
	default void print(String name){
		System.out.println(name);
	}
	
	static String sayHello(String name){
		return "Hello "+name;
	}
	
	abstract void doSomething();

}


