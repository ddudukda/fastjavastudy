package ch08_assignment;

public class UserInfo {

	public String name;
	public int age;
	public String gender;
	public int high;
	public int weight;
	
	public UserInfo() {}
	
	public UserInfo(String name,int age,String gender,int high,int weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.high = high;
		this.weight = weight;
		
	}
	
	public String showUserInfo() {
		return "키가 "+ high +"이고 몸무게가 "+weight+" 킬로인 " + gender+ "있습니다. 이름은 "+name+"이고 나이는 "+ age+"세 입니다.";
	}
	
	
}
