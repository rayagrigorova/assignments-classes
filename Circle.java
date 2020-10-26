package classes;

public class Circle {
	public double radius;
	
	public Circle(){radius = 1;}
	
	public Circle(double rad){
		if(rad > 0){
			radius = rad;
			return;
		}
		System.out.println("Radius must be a positive number");
		return;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	public void setRadius (double newRadius){
		if(newRadius >= 0){radius = newRadius; return;}
		System.out.println("The radius must be a positive number");
	}
}
