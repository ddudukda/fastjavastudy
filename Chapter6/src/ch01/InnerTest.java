package ch01;



class OutClass{
	
	private int num =10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass(); // 내부 클래스 생성
	}
	
	
	private class InClass{
		int inNum = 100;
		// static int sInNum = 500;  //에러남

		void inTest() {
			System.out.println("OutClass num = "+ num +"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+ sNum +"(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = "+ inNum +"(내부 클래스의 인스턴스 변수)");

		}
	}
	
	public void usintClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = "+ iNum +"(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+ sNum +"(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = "+ sInNum +"(내부 클래스의 스태틱 변수)");

		}
		
		static void sTest(){  // 정적 클래스의 static 메서드
			//num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			//inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			
		}

	}
	
}


public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usintClass();
		
		System.out.println();
		
		//OutClass.InClass inner = outClass.new InClass(); //private 일시 호출 불가
		//inner.inTest();
		
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
	
	}

}
