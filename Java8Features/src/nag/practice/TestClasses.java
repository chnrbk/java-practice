package nag.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

class TestClassesA {

}
 class TestClassesB {

}


 class TestClassesC {

}
 

public class TestClasses {
	static int a =0;
	
	public TestClasses() {
		System.out.println("constructor"+a);
	}
	
	public static void main(String[] args) {
		System.out.println("Main::"+a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println("current date"+LocalDateTime.now());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2016/11/16
	}

}