package banktree;

import java.util.Scanner;

public class Teacher {

	Student student = new Student();
	Scanner scanner = new Scanner(System.in);
	
	static int sum = (Student.kor + Student.math + Student.eng);
	static int avr = (sum)/3;
	
	
	
	

	public boolean inPut(){

		System.out.println("학생 이름 입력: ");
		student.name = scanner.next();
		System.out.println(student.name + "의 국어 점수");
		student.kor = scanner.nextInt();
		System.out.println(student.name + "의 영어 점수");
		student.eng = scanner.nextInt();
		System.out.println(student.name + "의 수학 점수");
		student.math = scanner.nextInt();
		System.out.println("====== 입력완료 =====");
		
		return true;
				
	}
	
	public boolean sum(){
		
		sum = (Student.kor + Student.eng + Student.math);
		System.out.print(student.name + "의 총점");
		System.out.print(sum);
		System.out.println();
		
		return true;
	}
	
	
	public boolean avr(){
		
		avr = (sum)/3;
		System.out.print(student.name + "의 평균");
		System.out.println(avr);
		System.out.println();
		
		return true;
	
	}	
}



