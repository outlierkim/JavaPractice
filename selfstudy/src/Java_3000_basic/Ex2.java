package Java_3000_basic;

public class Ex2 {

	public static void main(String[] args) {
		
		String[] array = {"One", "Two", "Three", "Four"};
		boolean stop = false;
		int index = 0;
		while(!stop){
			String item = array[index];
			if(item.equals("Three")){
				stop = true;
			} else{
				System.out.println(item);
			}
			index++;
		}
		
	}

}
