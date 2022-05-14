package laba4;

public class PerimeterCalculation extends Calculation {
	
	PerimeterCalculation(String a, String b){
		super.setside1(Double.parseDouble(a));
		super.setside2(Double.parseDouble(b));
	}
	
	
	@Override
	public double calculate(double a, double b) {
		  return 2*a+b;
	}
	
}
