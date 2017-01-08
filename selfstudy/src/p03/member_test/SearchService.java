package p03.member_test;

public class SearchService {

	String name;
	int height;
	int weight;
	String nation;
	
	String[][] memberInfo = { {"홍길동", "167", "77", "대한민국"}, {"James","187", "67", "미국"},
			{"가루상", "166", "57", "일본"}, {"알파고", "177", "80", "미국"},
			{"인도인", "199", "77", "인도"} };
	
	public void SearchService(String name){
		Member mb = Member.getInstance();
		
		for(int i = 0; i < memberInfo.length; i++){
			if(memberInfo[i][0].equals(name)){
				name = memberInfo[i][0];
				height = Integer.parseInt(memberInfo[i][1]);
				weight = Integer.parseInt(memberInfo[i][2]);
				nation = memberInfo[i][3];
				mb.setInfo(name, height, weight, nation);
				mb.memberPrint();
				break;
			}
			
		}
		
		
	}
			
			
	
	

	
}
