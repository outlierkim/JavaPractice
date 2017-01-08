package EulerEx;

public class PrimeFactorCopy {

	public static void main(String[] args) {
		System.out.println(new PrimeFactorCopy().run());
	}

	public String run() {
		long n = 600851475143L;
		while(true){
			long p = smallestFactor(n);
			if(p<n)
				n /=p;
			else
				return Long.toString(n);
		}
	
	
	}

	private static long smallestFactor(long n) {

		if(n <= 1)
			throw new IllegalArgumentException();

		for(long i = 2, end =sqrt(n); i<= end; i++){
			if(n % i == 0)
			return i;
		}	
		
		return n;
	}

	public static long sqrt(long x) {
		if(x < 0)
		throw new IllegalArgumentException("Square root of negative number");

		long y = 0;
		for(long i = 1L <<31; i != 0; i>>>=1){
			y |=i;
			if(y > 3037000499L || y * y > x)
			y ^= i;
		}
	
		return y;
	}

}
