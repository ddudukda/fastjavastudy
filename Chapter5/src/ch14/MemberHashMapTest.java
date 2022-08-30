package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		 MemberHashMap memberHashMap = new MemberHashMap();
		   
		 Member memberHong = new Member(1004, "홍길동");
		 Member memberLee = new Member(1001, "이순신"); 
		 Member memberKim = new Member(1002, "김유신"); 
		 Member memberKang = new Member(1003, "강감찬");
		  
		 memberHashMap.addMember(memberHong);
		 memberHashMap.addMember(memberLee); 
		 memberHashMap.addMember(memberKim);
		 memberHashMap.addMember(memberKang);
		  
		 memberHashMap.showAllMember();
  
		  
		  HashMap<Integer, String> hash = new HashMap<Integer, String>();
		  hash.put(111, "일");
		  hash.put(222, "이이");
		  hash.put(333, "삼삼삼");
		  hash.put(444, "사사사사");
		  
		  System.out.println(hash);

	}

}
