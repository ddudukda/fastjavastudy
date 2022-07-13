package ch11;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		if(y == 0) {
			return ERROR;
		}
		return x / y;
	}

	public void showInfo() {
		System.out.println("모두 구현 완료");
	}
}
