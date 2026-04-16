package power_pro;

//final with variable = constant value
//final with class = gives a class where no other can extend it
//final with method = method cannot be overridden

class Father
{
	public final void land()//final method
	{
		System.out.println("Father land");
	}
}
class Son extends Father
{
	public void land()
	{
		System.out.println("Son land");

	}
}
public class Final {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.land();

	}

}
