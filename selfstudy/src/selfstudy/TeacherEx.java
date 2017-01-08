package selfstudy;

import java.util.Scanner;

public class TeacherEx {
	
	public static Scanner scanner = new Scanner(System.in);
	StudentEx student = new StudentEx();
	
	//클래스 변수
	
	static int sum = (StudentEx.kor + StudentEx.eng + StudentEx.math);
	static double avr = (sum)/3;
	
	
	//생성자
	
	//학생 정보 입력
	
	public boolean inPut(){
		System.out.println("학생 이름 입력: ");
		student.name = scanner.next();
		System.out.println(student.name + " 의 국어 점수");
		student.kor = scanner.nextInt();
		System.out.println(student.name + " 의 영어 점수");
		student.eng = scanner.nextInt();
		System.out.println(student.name + " 의 수학 점수");
		student.math = scanner.nextInt();
		
		return true;
	}

	public boolean sum(){
		
		sum = (StudentEx.kor + StudentEx.math + StudentEx.eng);
		System.out.println(student.name + " 의 총점" + sum);
		
		return true;
	}
	
	public boolean avr(){
		
		avr = (sum)/3;
		System.out.println(student.name + "의 평균" + avr);
		
		return true;
		
	}
	
}
	
	


