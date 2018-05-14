package com.java5.generics;

 
public class GenericClassTest {
	public static void main(String args[]) {
		GenericClass<String> obj1 = new GenericClass<>();
		obj1.set("Nag");
		System.out.println(obj1.get());
	}

	private static class GenericClass<T> {

		private T t;

		public void set(T t) {
			this.t = t;
		}

		public T get() {
			return t;
		}

	}

}
