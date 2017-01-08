package p03_member_test;

import java.util.Scanner;

public class SearchService {

	String[][] memberInfo = { {"홍길동", "167", "77", "대한민국"}, {"James","187", "67", "미국"},
			{"가루상", "166", "57", "일본"}, {"알파고", "177", "80", "미국"},
			{"인도인", "199", "77", "인도"} };
			//다차원 배열로
	
	public void memberPrint(){
	
	Scanner sc = new Scanner(System.in);
	Member mb = new Member();
	String name = sc.next();
	mb.setName(name);
	System.out.println();
	
	for(int i = 0; i<memberInfo.length; i++){
		if(mb.getName().equals(memberInfo[i][0])){
			mb.setHeight(Integer.parseInt(memberInfo[i][1]));
			mb.setWeight(Integer.parseInt(memberInfo[i][2]));
			mb.setNation(memberInfo[i][3]);
		}
	}
	System.out.println(mb.getName() + "으로 찾은 결과");
	System.out.println("이름 : " + mb.getName());
	System.out.println("신장 : " + mb.getHeight());
	System.out.println("몸무게 : " + mb.getWeight());
	System.out.println("국가 : " + mb.getNation());

	System.exit(0);
	
	}
}
