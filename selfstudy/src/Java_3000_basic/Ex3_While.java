package Java_3000_basic;

import java.util.Scanner;

public class Ex3_While {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("----------------");
			System.out.println("1. 에코| 2. 종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			
			String menuNum = sc.next();
			
			switch(menuNum){
				
				case "1":
				System.out.println("입력>");
				String input = sc.nextLine();
				System.out.println("에코>" + input);
				break;
				
				case "2":
				run=false;
				break;
			}
			
			System.out.println();
			
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	

}
