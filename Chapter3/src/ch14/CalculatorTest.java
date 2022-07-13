package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		 Calc calc = new CompleteCalc(); int x = 10; int y = 4;
		  
		 System.out.println(x + "+" + y + "=" + calc.add(x,y)); 
		 System.out.println(x + "-" + y + "=" + calc.substract(x,y)); 
		 System.out.println(x + "*" + y + "=" + calc.times(x,y)); 
		 System.out.println(x + "/" + y + "=" + calc.divide(x,y));
		  
		 CompleteCalc com = new CompleteCalc(); com.showInfo();
		  
		 calc.description();
		 
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Calc.total(arr));

	}

}
