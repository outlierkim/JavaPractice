package firstweek.assignment;

import java.util.Scanner;

public class SchoolMain {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		Teacher teacher = new Teacher();
		
		while(true){
		
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 총점 출력");
		System.out.println("3. 학생 평균 출력");
		System.out.println("4. 프로그램 종료\n");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1){			
			teacher.inPut();
		} else if(selectNo ==2){
			teacher.sum();
		} else if(selectNo == 3){
			teacher.avr();
		} else if(selectNo == 4){
			System.out.println("프로그램 종료");

		}
		
	}	
		
	}

}
