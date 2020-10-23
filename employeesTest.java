package classes;

import java.util.Random;

public class employeesTest {
	
	public static Employee promotion(Employee[] employees) {
		// TODO Auto-generated method stub
		Employee bestCandidate  = employees[0];
		
		for(int i = 1; i < employees.length; i++){
			if(employees[i].getRating() > bestCandidate.getRating()){
				bestCandidate = employees[i];
			}
		}
		
		return bestCandidate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Employee employees[] = new Employee[10];
		
		for(int i  = 0; i < 10; i++)employees[i] = new Employee();
		
		for(int i = 0; i < 10; i++){
			employees[i].rating = r.nextInt(30) + 60;
		}
		
		Employee best = new Employee();
		best = promotion(employees);
		
		System.out.println(best.rating);
	}

	

}
