package banktree;

import java.util.Scanner;

public class Teacher {

	Student student = new Student();
	Scanner scanner = new Scanner(System.in);
	
	static int sum = (Student.kor + Student.math + Student.eng);
	static int avr = (sum)/3;
	
	
	
	

	public boolean inPut(){

		System.out.println("�л� �̸� �Է�: ");
		student.name = scanner.next();
		System.out.println(student.name + "�� ���� ����");
		student.kor = scanner.nextInt();
		System.out.println(student.name + "�� ���� ����");
		student.eng = scanner.nextInt();
		System.out.println(student.name + "�� ���� ����");
		student.math = scanner.nextInt();
		System.out.println("====== �Է¿Ϸ� =====");
		
		return true;
				
	}
	
	public boolean sum(){
		
		sum = (Student.kor + Student.eng + Student.math);
		System.out.print(student.name + "�� ����");
		System.out.print(sum);
		System.out.println();
		
		return true;
	}
	
	
	public boolean avr(){
		
		avr = (sum)/3;
		System.out.print(student.name + "�� ���");
		System.out.println(avr);
		System.out.println();
		
		return true;
	
	}	
}



