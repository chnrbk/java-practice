package nag.java.com;

public class FactoryPattern {

	public static void main(String[] args) {
		
		LapTopFactory laptopfactory = new LapTopFactory();
		Laptop dellLaptop = laptopfactory.getLapTop("Dell");
		dellLaptop.getLaptopConfig("Dell");
		Laptop lenovoLaptop = laptopfactory.getLapTop("Lenovo");
		lenovoLaptop.getLaptopConfig("Dell");
	}

}
