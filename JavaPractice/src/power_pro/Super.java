package power_pro;
//super(); method will be invincible there 
//this(); method will class the present class constructor
//all the classes in java extends class super();
class Oneplus5
{
	public Oneplus5()
	{
		System.out.println("It is 5");
	}
}
class Oneplus6 extends Oneplus5
{
	public Oneplus6()
	{
		System.out.println("It is 6");
	}

	public Oneplus6(int i) {
        this();
		System.out.println("It is int");

	}
}
public class Super {

	public static void main(String[] args) {
		Oneplus6 obj = new Oneplus6(2);

	}
}


