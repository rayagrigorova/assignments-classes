package Classes;

public class MyException extends Exception {
	private String msg;
	
	MyException (){msg = "OOPS!";}
	public void print() {System.out.println(msg);}
	public void setMessage(String msg) {this.msg = msg; return;}
}
