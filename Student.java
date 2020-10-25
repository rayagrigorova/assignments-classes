package Classes;

public class Student {
//	Създайте обект ученик с полета име и среден успех.
//	Нека класа има два конструктора - празен, и - с името и успеха.
//	Създайте метод, който проверява дали един ученик е с успех за стипендия
//	(параметър - ученик, ретърн тип - boolean) . Създайте масив от ученици 
//	(5 на брой). Запълнете масива със стойности въведени от потребителя.
//	Създайте метод, който приема като параметър масив от ученици и извежда в конзолата онези от 
//	тях, които ще получат стипендии.
	public String name;
	public double averageGrade;
	public final double SCHOLAR_GRADE = 5.5;
	
	
	Student(){};
	
	Student(String n, double avrg){
		name = n;
		averageGrade = avrg;
	}
	
	public boolean scholarship() {
		if(averageGrade >= 5.5) {return true;}
		
		return false;
	}
	
	
}
