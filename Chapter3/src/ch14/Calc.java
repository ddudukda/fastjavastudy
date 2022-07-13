package ch14;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999999;
	 
	int add(int x, int y);
	int substract(int x, int y);
	int times(int x, int y);
	int divide(int x, int y);
	
	default void description() {
		System.out.println("정수 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드");
	}
	private static void myStaticMethod() {
		System.out.println("private static 메서드(myStaticMethod) : 인스턴스 생성 X");
	}

}
