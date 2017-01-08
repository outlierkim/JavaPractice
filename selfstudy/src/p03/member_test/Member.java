package p03.member_test;

public class Member {

	private String name;
	private int height;
	private int weight;
	private String nation;
	private static Member mb = new Member();
	
	public static Member getInstance(){
		return mb;
		
	}
	
	public void setInfo(String name, int height, int weight, String nation){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.nation = nation;
		
	}
	
	public void memberPrint(){
		System.out.println(name + "으로 찾은 결과");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("국가 : " + nation);
		
	}
	
	
	
	
}
