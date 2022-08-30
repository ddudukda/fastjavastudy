package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberhashset = new MemberHashSet();
		
		//리스트에 들어갈 멤버 생성
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberhashset.addMember(memberLee);
		memberhashset.addMember(memberKim);
		memberhashset.addMember(memberKang);

		memberhashset.showAllMember();  //순서 아무렇게나 나옴
		
		
		Member memberHong = new Member(1003, "홍길동"); //equals() 와 hashcode() 구현 후 중복값은 add되지 않는다.
		memberhashset.addMember(memberHong);

		
		memberhashset.showAllMember();  //아이디 중복이지만 들어감. > member에서 중복에 관한 설정이 없기 떄문이다.
		
	
		
	}

}
