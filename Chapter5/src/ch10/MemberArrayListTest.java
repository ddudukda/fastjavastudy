package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberlist = new MemberArrayList();
		
		//리스트에 들어갈 멤버 생성
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");
		
		memberlist.addMember(memberLee);
		memberlist.addMember(memberKim);
		memberlist.addMember(memberKang);
		memberlist.addMember(memberHong);

		memberlist.showAllMember();  //들어간 순서대로 나오는거 확인
		
		memberlist.removeMember(memberKim.getMemberId());
		memberlist.showAllMember();  //제거해도 순서 그대로 유지
		
	}

}
