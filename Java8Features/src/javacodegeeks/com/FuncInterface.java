package javacodegeeks.com;

@FunctionalInterface
public interface FuncInterface<Float> {

	default void defaultMethod() {
		System.out.println("");
	}
	
	public abstract void abstractMethod(int x);
}

