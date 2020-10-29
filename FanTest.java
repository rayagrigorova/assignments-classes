package Classes;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Напишете тестова програма, която създава два обекта от класа Fan. Задайте
		 * максимална скорост, радиус 10, цвят жълт, и включете първия обект. Задайте
		 * средна скорост, радиус 5, цвят син и изключете втория обект. Изведете
		 * обектите в конзолата, като извикате метода toString.
		 */
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		
		f1.setSpeed(f1.FAST);
		f1.setRadius(10);
		f1.setColor("Yellow");
		f1.setState(true);
		
		f2.setSpeed(f2.MEDIUM);
		f2.setRadius(5);
		f2.setColor("Blue");
		f2.setState(false);
		
		System.out.println(f1.toString() + "\n" + f2.toString());
		
	}

}
