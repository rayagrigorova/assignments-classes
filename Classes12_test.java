package Classes;

public class Classes12_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_2 student = new Student_2();
		Circle_2 circle = new Circle_2();
		
		System.out.println("Before setting:");
		System.out.println(student.getName() + " " + student.getAverageGrade());
		System.out.println(circle.getRadius());
		
		student.setName("Ivana");
		student.setAverageGrade(5.577);
		circle.setRadius(2.5);
		
		System.out.println("\nAfter setting:");
		System.out.println(student.getName() + " " + student.getAverageGrade());
		System.out.println(circle.getRadius());
		
		System.out.println("\n\n" + student.scholarship() );
		System.out.println(circle.getPerimeter() + " " + circle.getArea() );
	}

}
