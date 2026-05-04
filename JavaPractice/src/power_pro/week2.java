package power_pro;
interface Shape
{
	final double PIE = 3.14;
	default void getArea(double num1) {
		System.out.println(num1);
	}
}

class Circle implements Shape
{
	
	public void getArea(double num1)
	{
		double AC;
		AC = PIE * num1 * num1 ;
		System.out.println("Area of circle is: " +  AC);
	}
}
class Rectangle implements Shape
{
	public void getArea(double num1 , double num2)
	{
		double AR;
		AR = 0.5 * num1 * num2;
		System.out.println("Area of circle is: " +  AR);
	}
}



public class week2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.getArea(2);
		Rectangle r = new Rectangle();
		r.getArea(2,4);
		
	}
}
