package EulerEx;

public class TheLargestPalindromeNum {

	public static void main(String[] args) {

	//두 자리 수 곱해서 만들 수 있는 가장 큰 수 9009 = 91*99
	//세 자리 수를 곱해서
		
	System.out.println(new TheLargestPalindromeNum().run());
	
	}

	public String run() {
		
		int maxPalin = -1; //이걸 왜 -1로 설정
		for(int i =100; i<1000; i++){
			for(int j = 100; j<1000; j++){
				int prod = i * j; //prod값이 대칭수
				if(isPalindrome(prod)&& prod > maxPalin) //뒤의 prod > maxPalin의 의미?
					maxPalin = prod;
			}
		}
		return Integer.toString(maxPalin);
	}

	public static boolean isPalindrome(int x) {
		return isPalindrome(Integer.toString(x)); //integer 값으로 변환?
	}
	public static boolean isPalindrome(String s){
		return s.equals(reverse(s));
	}	

	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
