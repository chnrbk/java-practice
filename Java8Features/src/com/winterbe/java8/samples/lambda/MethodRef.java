package com.winterbe.java8.samples.lambda;

public class MethodRef {
	
	@FunctionalInterface
	public interface Converter<F, T> {
		T convert(F from);
	}

	public static void main(String[] args) {
		
		Converter<String,Integer> converter = (from)->Integer.valueOf(from);
		Integer convereted = converter.convert("123");
		System.out.println(convereted);
		
		//method ref
		//(Converter::convert);

	}

}
