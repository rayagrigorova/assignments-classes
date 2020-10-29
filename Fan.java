package Classes;

public class Fan {
//	Създайте клас на име Fan, който да представлява вентилатор. Класът съдържа:
//		Три константи с име SLOW, MEDIUM и FAST със стойности 1, 2 и 3 за обозначаване на скоростта на вентилатора.
//		Private поле за данни int с име speed, което определя скоростта на вентилатора (по подразбиране е SLOW).
//		Private булево поле за данни switchedOn, което указва дали вентилаторът е включен (по подразбиране е false).
//		Private double поле за данни, наречено радиус, което определя радиуса на вентилатора (по подразбиране е 5).
//		Private поле с String данни с име color, което определя цвета на вентилатора (по подразбиране е син).
//		Аксесори и мутатотри (getter/setter) за четирите полета с данни.
//		Конструктор без аргументи, който създава вентилатор по подразбиране.

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	
	private int speed;
	private boolean switchedOn;
	private double radius;
	private String color;
	
	Fan(){
		speed = SLOW;
		switchedOn = false;
		radius = 5;
		color = "Blue";
	}
	
	public void setSpeed(int newSpeed) {
		if(speed > 0 && speed <= 3) {speed = newSpeed;}
		else System.out.println("The speed must be a positive integer");
		return;
	}
	
	public void setState(boolean newState) {
		switchedOn = newState;
		return;
	}
	
	public void setRadius (double newRadius) {
		if(newRadius > 0) {radius = newRadius;}
		else System.out.println("The radius must be a positive double");
	}
	
	public void setColor(String newColor) {
		color = newColor;
		return;
	}
	
	public int getSpeed() {return speed;}
	public boolean getState() {return switchedOn;}
	public double getRadius() {return radius;}
	public String getColor() {return color;}
	
//	Метод с име toString (), който връща описание за вентилатора под формата на низ. Ако вентилаторът 
//	е включен, методът връща скоростта, цвета и радиуса на вентилатора в един комбиниран низ.
//	Ако вентилаторът не е включен, методът връща цвета и радиуса на вентилатора заедно със низа 
//	„вентилаторът е изключен“ в един комбиниран низ.
	
	public String toString () {
		String s = "";
		if(switchedOn) {
			s += String.valueOf(speed) + " " + color + " " + String.valueOf(radius);
		}
		else {
			s += color + " " + String.valueOf(radius) + " The fan is turned off";
		}
		
		return s;
	}
	

}
