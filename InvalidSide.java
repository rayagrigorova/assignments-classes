package Classes;

public class InvalidSide extends MyException{
	InvalidSide(){this.setMessage("The length of the side must be > 0.");}
}
