package ArrayListScore;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {

	public static void main(String[] args) {
		
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개의 학점을 빈 칸으로 분리하여 입력하세요(A/B/C/D/F)>>");
		for(int i =0; i<5; i++){
			String s = scanner.next();
			if(s.length()>1){
				System.out.println("Not character");
				return;
			}
			char ch = s.charAt(0);
			if(ch >= 'A'&& ch <= 'D' || ch == 'F'){
				a.add(ch);
		} else{
			System.out.println("Invalid");
			return;
		}
		
		double score = 0.0;
		for(int i = 0; i <a.size(); i++){
			char ch = a.get(i);
		}
			switch(ch){
			
			case 'A': score = 4.0; break;
			case 'B': score = 3.0; break;
			case 'C': score = 2.0; break;
			case 'D': score = 1.0; break;
			case 'F': score = 0.0; break;
			}
			System.out.println(score + " ");
		}
		
		
	}
	}
