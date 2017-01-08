package Java_3000_basic;

import java.util.Scanner;

public class Ex4_Binary {

	public static void main(String[] args) {
		
		int arr[] = new int[16]; //배열 선언
		int num; //입력받을 정수 선언
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("값 입력: ");
		
		num = Integer.parseInt(input.nextLine()); //정수입력
		
		//배열에 2진수로 변환해서 넣기
		for(int i =0; num !=0; i++){
			arr[i] = num%2;
			num /= 2;
		}
		
		//거꾸로 출력
		for(int j= arr.length-1; j>=0; j--){
			if(j%4 == 3) //4칸씩 구분
				System.out.printf(" ");
			
			System.out.printf("%d", arr[j]);
			
		}
		
	}

}
