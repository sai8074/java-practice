package power_pro;

class A
{
    public A()//Normal constructor
	{
		System.out.println("Normal");
	}
	public A(int n)//parameterized constructor
	{
		super();
		System.out.println("Parameterized");

	}
}
public class Construtor {

	public static void main(String[] args) {
    A a = new A(2);
	}

}
