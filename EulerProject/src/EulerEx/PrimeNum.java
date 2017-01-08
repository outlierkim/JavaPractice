package EulerEx;



public final class PrimeNum {

	public static void main(String[] args) {
	
		int number = 1, i =2;
		while(number != 10001){
			i++;
			boolean isPrime = true;
			for(int j =2; j<Math.sqrt(i); j++){
				if(i%j ==0){
					isPrime = false;
				}
			}
			if(isPrime){
				number++;
			}
			
		}
		System.out.println(i);
		
	}
}