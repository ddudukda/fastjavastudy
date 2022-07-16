package ch13;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparable<Member> {

	private int memberId;
	private String memberName;

	// 생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId == member.memberId) {
				return true;
			} else
				return false;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public String toString() {
		return memberName + "의 아이디는 " + memberId + "입니다.";

	}

		
	@Override
	public int compareTo(Member member) {
		
		/*			
			  if(this.memberId > member.memberId) { 
				  return -1; 
			  }else if(this.memberId < member.memberId) {
				  return 1;
			  }else return 0;
			 
			*/	
		
	//간단하게 정리
	return (this.memberId - member.memberId);  //오름차순, 내림차순 하고 싶음 *(-1)하여 음수로 만들기
		
	}
	
	

}
