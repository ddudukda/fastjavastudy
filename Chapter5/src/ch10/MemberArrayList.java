package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arraylist;
	
	public MemberArrayList() {
		arraylist = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arraylist.add(member);
		
	}

	/*
	 * public boolean removeMember(int memberId) {
	 * 
	 * for(int i =0; i<arraylist.size();i++) { 
	 * Member member = arraylist.get(i); 
	 * int tempId = member.getMemberId(); 
	 * if(tempId == memberId) { 
	 * arraylist.remove(i);
	 * return true; 
	 * }
	 *  }
	 *   System.out.println(memberId+"가 존재하지 않습니다."); return false; }
	 */
	
	//Iterator사용
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = arraylist.iterator();
		while(ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId(); 
			 if(tempId == memberId) { 
			 arraylist.remove(member);
			 return true; 
			 }
		}
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	
	public void showAllMember() {
		
		for(Member member: arraylist) {
			System.out.println(member);
		}
		System.out.println();
	}
}
