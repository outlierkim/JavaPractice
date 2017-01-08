package selfstudy;

import java.util.Scanner;

public class SchoolMainEx {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		TeacherEx teacher = new TeacherEx();
		
	while(true){
		
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 총점 출력");
		System.out.println("3. 학생 평균 출력");
		System.out.println("4. 프로그램 종료 \n");
		
		int selectNO = scanner.nextInt();
		
		if(selectNO == 1){
			teacher.inPut();
		} else if(selectNO == 2){
			teacher.sum();
		} else if(selectNO == 3){
			teacher.avr();
		}
		
		
		}
	
	
	}
	
}
