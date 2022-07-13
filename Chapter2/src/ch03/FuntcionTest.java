package ch03;

public class FuntcionTest {

	public static int addNum(int x, int y) {
		int result;
		result = x + y;
		return result;
	}
	
	public static void sayHello(String geerting) {
		System.out.println(geerting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i=0; i<=100; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 21;
		int total = addNum(num1,num2);
		System.out.println(total);
		sayHello("안녕하세요");
		total = calcSum();
		System.out.println(total);
		
	}

}
