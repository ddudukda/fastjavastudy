package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		
		for(int i=0, num=1; i < arr.length; i++) {
			//System.out.println(arr[i]); //초기화 확인
			arr[i] = num++;
		}
		
		//처음부터 끝까지 반복할때
		for(int num : arr) {
			total +=num;
		}
		
		System.out.println(total);
		
		
		
	}

}
