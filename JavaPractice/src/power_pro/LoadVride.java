package power_pro;
//overloading meant for two or more methods with same name but different number of parameters
//overriding meant for when a method is having same set of parameters same as another method but 
//behaves differently
class First//Overloading example
{
	public void sin()
	{
		System.out.println("Firstt");
	}
	public void sin(int n)
	{
		System.out.println("Second");

	}
}

class Second extends First//Overriding example 
{
	public void sin(int n)
	{
		System.out.println("OverRiding");

	}
}

public class LoadVride {

	public static void main(String[] args) {
    First F = new Second();
    F.sin();
    F.sin(2);
	}

}
