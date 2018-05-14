package nag.java.com;

public class LapTopFactory {
	
	public Laptop getLapTop(String brandName){
		
		if(brandName.equals("Lenovo")){
			return new LenovoLaptop();
			
		}
		else if(brandName.equals("Dell")){
			return new DellLaptop();

		}
		
		return null;
	}
}
