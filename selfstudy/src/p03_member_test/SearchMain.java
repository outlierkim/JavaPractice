package p03_member_test;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		
		SearchService sr = new SearchService();
		
		System.out.println("[검색할 회원 이름을 입력하세요.]");
		
		sr.memberPrint();
		
		
	}

}
