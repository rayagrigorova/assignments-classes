package Classes;

public class SpeedException extends MyException {
	SpeedException(){this.setMessage("Speed must be an int between 1 and 3");}
}
