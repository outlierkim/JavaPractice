package EulerEx;

import java.math.BigInteger;

public class FactorialDigitNo {

	public static void main(String[] args) {

		//10! = 3628800
		// the sum of the digits in the number 10! = 3+6+2+8+8+0+0 = 27
		// the sum of the digits in the number 100!?
	int num =1;
	int reminder;
	int sum = 0;
		
	for(int i =1; i<=7; i++){
		num = num*i;
	}
	while(num>0){
		reminder = num%10;
		sum = sum + reminder;
		num = num/10;
		
	}
	System.out.println(sum);
	
	
//		System.out.println(new FactorialDigitNo().run());
//		}
//
//		public String run() {
//			String temp = factorial(100).toString();
//			int sum = 0;
//			for (int i = 0; i < temp.length(); i++)
//				sum += temp.charAt(i) - '0';
//			return Integer.toString(sum);
//		}
//
//		public static BigInteger factorial(int n) {
//			if (n < 0)
//				throw new IllegalArgumentException("Factorial of negative number");
//			BigInteger prod = BigInteger.ONE;
//			for (int i = 2; i <= n; i++)
//				prod = prod.multiply(BigInteger.valueOf(i));
//			return prod;
//	
	}

}
