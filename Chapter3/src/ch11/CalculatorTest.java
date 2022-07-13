package ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		int x = 10;
		int y = 4;
		
		System.out.println(x + "+" + y + "=" + calc.add(x, y));
		System.out.println(x + "-" + y + "=" + calc.substract(x, y));
		System.out.println(x + "*" + y + "=" + calc.times(x, y));
		System.out.println(x + "/" + y + "=" + calc.divide(x, y));
		
		CompleteCalc com = new CompleteCalc();
		com.showInfo();

	}

}
