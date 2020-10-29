package Classes;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Напишете тестова програма, която създава три обекта RegularPolygon, създадени
		 * с помощта на празния конструктор, използвайки RegularPolygon (6, 4) и
		 * използвайки RegularPolygon (10, 4, 5.6, 7.8). За всеки обект покажете неговия
		 * периметър и площ.
		 */
		
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Object 1 : " + r1.getPerimeter() + " " + r1.getArea());
		System.out.println("Object 2 : " + r2.getPerimeter() + " " + r2.getArea());
		System.out.println("Object 3 : " + r3.getPerimeter() + " " + r3.getArea());
		
	}

}
