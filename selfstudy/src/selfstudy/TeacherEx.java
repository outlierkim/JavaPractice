package selfstudy;

import java.util.Scanner;

public class TeacherEx {
	
	public static Scanner scanner = new Scanner(System.in);
	StudentEx student = new StudentEx();
	
	//Ŭ���� ����
	
	static int sum = (StudentEx.kor + StudentEx.eng + StudentEx.math);
	static double avr = (sum)/3;
	
	
	//������
	
	//�л� ���� �Է�
	
	public boolean inPut(){
		System.out.println("�л� �̸� �Է�: ");
		student.name = scanner.next();
		System.out.println(student.name + " �� ���� ����");
		student.kor = scanner.nextInt();
		System.out.println(student.name + " �� ���� ����");
		student.eng = scanner.nextInt();
		System.out.println(student.name + " �� ���� ����");
		student.math = scanner.nextInt();
		
		return true;
	}

	public boolean sum(){
		
		sum = (StudentEx.kor + StudentEx.math + StudentEx.eng);
		System.out.println(student.name + " �� ����" + sum);
		
		return true;
	}
	
	public boolean avr(){
		
		avr = (sum)/3;
		System.out.println(student.name + "�� ���" + avr);
		
		return true;
		
	}
	
}
	
	


