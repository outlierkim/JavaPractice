package firstweek.assignment;

import java.util.Scanner;

public class Teacher {
	
	public static Scanner scanner = new Scanner(System.in);
	Student student = new Student();
	//Ŭ���� ����
	static int sum = (student.kor + student.math + student.eng);
	static double avr;
	
	//������
		
		
	//�л� ���� �Է�
	public boolean inPut(){
		Student student = new Student();
		System.out.println("�л� �̸� �Է�: ");
		student.name = scanner.next();
		System.out.println(student.name + "�� ���� ����");
		student.kor = scanner.nextInt();
		System.out.println(student.name + "�� ���� ����");
		student.eng = scanner.nextInt();
		System.out.println(student.name + "�� ���� ����");
		student.math = scanner.nextInt();
		System.out.println("=====�Է¿Ϸ�=====");
		
		return true;
	}

	public boolean sum(){
		Student student = new Student();
		System.out.print(student.name + "�� ���� : ");
		System.out.print(sum);
	
		return true;
	}
	
	public boolean avr(){
		Student student = new Student();
		System.out.print(student.name + "�� ��� : ");
		System.out.print((sum)/3);

		return true;
	}
}
