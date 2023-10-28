package week1.day1;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mahindra = new Car();
		Bike ktm = new Bike();
		
		mahindra.applyBreak();
		mahindra.soundHorn();
		System.out.println("Bike class members " + ktm.brakes +  ktm.tyres);
						

	}
	
	String brakes = "Strong Breaks ";
	int tyres = 2;

}
