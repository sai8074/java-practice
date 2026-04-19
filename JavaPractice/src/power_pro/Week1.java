package power_pro;
class Bank
{
	int num = 2;
	static int num1 = 3;//static variable
	final int num2 = 4;
	public Bank()
	{
		System.out.println("Normal constructor" +  num + " " + num1  + " " + num2);
	}
	public Bank(int num)
	{
		System.out.println("Parameterized constructor");

	}
	public static void branch()//static method
	{
		System.out.println("Delhi branch");

	}
	public void code()
	{
		System.out.println("0001");

	}
	public void code(int num)
	{
		System.out.println("0002");

	}
}

class SubBank extends Bank{
	public SubBank()
	{
		System.out.println("SubBank constructor" + " " + num1  + " " + num2);
	}
	public SubBank(int num)
	{
		this();//this method used to call present class constructor
		//super(); method used to call extended class constructor
		System.out.println("SubBank parameterized constructor" + " " + num1  + " " + num2);
	}
	int num1 = 3;
	public void code(int num)
	{
		System.out.println("00024");

	}

}
public class Week1 {

	public static void main(String[] args) {
    Bank B = new SubBank(2);
    B.code();
    B.code(2);
    Bank.branch();
	}

}
