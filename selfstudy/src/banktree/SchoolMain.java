package banktree;

import java.util.Scanner;

public class SchoolMain {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Teacher teacher = new Teacher();

		while(true){
			System.out.println("1.�л� ���� �Է�");
			System.out.println("2.�л� ���� ���");
			System.out.println("3.�л� ��� ���");
			System.out.println("4.���α׷� ����");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1){
				teacher.inPut();
			} else if(selectNo == 2){
				teacher.sum();
			} else if(selectNo == 3){
				teacher.avr();
			}

			
			
		}
		
		
	}

}
