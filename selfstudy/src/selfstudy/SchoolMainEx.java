package selfstudy;

import java.util.Scanner;

public class SchoolMainEx {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		TeacherEx teacher = new TeacherEx();
		
	while(true){
		
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. �л� ��� ���");
		System.out.println("4. ���α׷� ���� \n");
		
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
