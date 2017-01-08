package Interface_;

public interface Lendable {

	void checkOut(String borrower, String date); //대출한다
	void checkIn(); //반납한다. 
	
}
