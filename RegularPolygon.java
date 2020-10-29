package Classes;

public class RegularPolygon {
	/*
	 * * Private поле за данни int с име n, което определя броя на страните в
	 * полигона със стойност по подразбиране 3.
	 * 
	 * Private double поле за данни с име sideLength, което съхранява дължината на
	 * страните. Сойност по подразбиране 1.
	 * 
	 * Private double поле с данни, наречено x, което определя x-координатата на
	 * центъра на със стойност по подразбиране 0.
	 * 
	 * Private double поле с данни, наречено у, което определя у-координатата на
	 * центъра на със стойност по подразбиране 0.
	 */
	private int n;
	private double sideLength;
	private double x;
	private double y;

	/*
	  Конструктор без аргументи, който създава многоъгълник със стойности по
	  подразбиране.
	 */
	RegularPolygon(){
		n = 3;
		sideLength = 1;
		x = 0;
		y = 0;
	}
	/*
	  Конструктор, който създава правилен многоъгълник с посочения брой страни и
	  дължина на страната, центрирана в (0, 0).
	 */
	RegularPolygon(int n, double sideLength){
		
		try {
			if(n < 3) {throw new InvalidN();}
			if (sideLength <= 0) {throw new InvalidSide();}
			
			this.n = n;
			this.sideLength = sideLength;
			x = 0;
			y = 0;
		}

		catch (InvalidN | InvalidSide s) {
			s.print();
		}
		catch (Exception e) {
			System.out.println("How did you get here?");
		}
	}
	
	/*
	 Конструктор, който създава правилен многоъгълник с посочения брой страни,
	 дължина на страната и координати x и y.
	 */
	RegularPolygon(int n, double sideLength, double x, double y ){
		try {
			if(n < 3) {throw new InvalidN();}
			if(sideLength <= 0) {throw new InvalidSide();}
				this.n = n;
				this.sideLength = sideLength;
				this.x = x;
				this.y = y;
	
		}
		catch(InvalidN | InvalidSide o) {
			o.print();
		}
		catch (Exception e) {
			System.out.println("How did you get here?");
		}
	}
	
	

	/*
	  Методите за достъп - аксесори и мутатотри (getter/setter) за всички полета с
	  данни.
	 */
	
	public int getN() {return n;}
	public double getSideLength() {return sideLength;}
	public double getX() {return x;}
	public double getY() {return y;}
	
	public void setN(int n) {
		try {
			if (n < 3) {throw new InvalidN();}
			
			this.n = n;
		}
		catch (InvalidN x) {
			x.print();
		}
		catch(Exception e) {
			System.out.println("How did you get here?");
		}
		
		return;
	}
	
	
	public void setSideLength(double sideLength) {
		try {
			if(sideLength <= 0) throw new InvalidSide();
			
			this.sideLength = sideLength;
		}
		catch (InvalidSide x) {
			x.print();
		}
		catch(Exception e) {
			System.out.println("How did you get here?");
		}
		return;
	}
	
	public void setX(double x) {
		this.x = x;
		return;
	}
	
	public void setY(double y) {
		this.y  = y;
		return;
	}
	
	/*
	 * Методът getPerimeter (), който връща периметъра на полигона.
	 */
	public double  getPerimeter () {return n * sideLength;}
	
	
	/*
	  Методът getArea (), който връща площта на
	  полигона. 
	  Формулата за изчисляването на площта на правилен многоъгълник е
	 */
	public double getArea () {return (Math.pow(sideLength, 2) * n) / (4 * Math.tan(Math.PI / n));}
}
