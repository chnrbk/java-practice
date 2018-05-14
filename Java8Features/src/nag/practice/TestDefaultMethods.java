package nag.practice;

import java.util.Objects;
import java.util.function.Predicate;

public class TestDefaultMethods implements Interface1 {

	public static void main(String[] args) {
		TestDefaultMethods d = new TestDefaultMethods();
		d.method2();
		d.method1();
		}

	@Override
	public void method2() {
		System.out.println("method2 implementation");
	}
	

	@Override
	public void method1() {
		System.out.println("method1 implementation");
	}
	static <T> Predicate<T> isEqual(Object target) {
		return (null == target)
		? Objects::isNull
		: object -> target.equals(object);
		}
}
