package EulerEx;

public final class SumSquareDifference {

	public static void main(String[] args) {
		int sum1 =0;
		int sum2 = 0;
		
		System.out.println(SumSquareDifference.run());
		
		for(int i=0; i<=100; i++){
			sum1 += i;
			sum2 += i*i;
		}
		System.out.println(sum1*sum1 - sum2);
		
	}
	
//	//합의 제곱
//	public int sumSquare(){
//		int sum=0;
//		int sumSqure =0;
//		for(int i =0; i<=100; i++){
//			sum += i;
//		}
//		return sumSqure = (int) Math.pow(sum, 2);
//	} 
//
//	//제곱의 합
//	public int squareSum(){
//		int square=0;
//		int sum = 0;
//		for(int i =0; i<=100; i++){
//			square = (int) Math.pow(i, 2);
//		}
//		return sum += square;
//		
//	}
	
	private static final int N = 100;
	
	public static String run(){
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<=N;i++){
			sum1 += i*i;
			sum2 += i;
		}
		return Integer.toString(sum2*sum2 - sum1); 
	
	}
	
	
}
