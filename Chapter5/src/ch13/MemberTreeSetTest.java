package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		/*
		 * TreeSet<String> tree = new TreeSet<String>();
		 * 
		 * tree.add("홍길동"); tree.add("김철수"); tree.add("강감찬"); tree.add("이순신");
		 * 
		 * System.out.println(tree); // 이름순 정렬 확인
		 */
		
		  MemberTreeSet membertreeSet = new MemberTreeSet();
		  
		  //리스트에 들어갈 멤버 생성 
		  Member memberHong = new Member(1004, "홍길동");
		  Member memberLee = new Member(1001, "이순신"); 
		  Member memberKim = new Member(1002, "김유신"); 
		  Member memberKang = new Member(1003, "강감찬");
		  
		  membertreeSet.addMember(memberHong);
		  membertreeSet.addMember(memberLee); 
		  membertreeSet.addMember(memberKim);
		  membertreeSet.addMember(memberKang);
		  
		  membertreeSet.showAllMember();
		  

	}

}
