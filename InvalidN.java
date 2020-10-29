package Classes;

public class InvalidN extends MyException {
	InvalidN(){this.setMessage("Invalid value for n. N must be >= 3.");}
}
