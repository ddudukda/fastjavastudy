package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) *(-1);  // String은 default 오름차순이기 때문에 내림차순을 해주기 위해 Comparator을 사용하여 내림차순으로 재구현
		
	}
	
}


public class TreeSetCompareTest {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("Hong");
		set.add("Kim");
		set.add("Joy");
		set.add("Alex");
		
		System.out.println(set);
		
	}

}
