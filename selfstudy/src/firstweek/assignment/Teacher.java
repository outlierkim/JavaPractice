package firstweek.assignment;

import java.util.Scanner;

public class Teacher {
	
	public static Scanner scanner = new Scanner(System.in);
	Student student = new Student();
	//클래스 변수
	static int sum = (student.kor + student.math + student.eng);
	static double avr;
	
	//생성자
		
		
	//학생 정보 입력
	public boolean inPut(){
		Student student = new Student();
		System.out.println("학생 이름 입력: ");
		student.name = scanner.next();
		System.out.println(student.name + "의 국어 점수");
		student.kor = scanner.nextInt();
		System.out.println(student.name + "의 영어 점수");
		student.eng = scanner.nextInt();
		System.out.println(student.name + "의 수학 점수");
		student.math = scanner.nextInt();
		System.out.println("=====입력완료=====");
		
		return true;
	}

	public boolean sum(){
		Student student = new Student();
		System.out.print(student.name + "의 총점 : ");
		System.out.print(sum);
	
		return true;
	}
	
	public boolean avr(){
		Student student = new Student();
		System.out.print(student.name + "의 평균 : ");
		System.out.print((sum)/3);

		return true;
	}
}
