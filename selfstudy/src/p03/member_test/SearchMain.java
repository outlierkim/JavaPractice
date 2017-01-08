package p03.member_test;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class SearchMain {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		SearchService sr = new SearchService();
		
		System.out.println("[검색할 회원 이름을 입력하세요]");
		name = sc.next();
		
		System.out.println();
		sr.SearchService(name);
		
	}

}
