package firstweek.assignment;

import java.util.Scanner;

public class SchoolMain {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		Teacher teacher = new Teacher();
		
		while(true){
		
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. �л� ��� ���");
		System.out.println("4. ���α׷� ����\n");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1){			
			teacher.inPut();
		} else if(selectNo ==2){
			teacher.sum();
		} else if(selectNo == 3){
			teacher.avr();
		} else if(selectNo == 4){
			System.out.println("���α׷� ����");

		}
		
	}	
		
	}

}
