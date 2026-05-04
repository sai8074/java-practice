package power_pro;
//A default method has a concrete implementation inside the interface. 
//Classes that implement the interface inherit it automatically but can also override it.
//--------------------
//A static method belongs to the interface itself, not to any instance or implementing class. 
//You call it via the interface name directly.

//In modern Java, interfaces are preferred by default. 
//Reach for an abstract class only when you genuinely need shared state or a constructor.
//Many well-designed Java APIs (like Comparable, Runnable, List) are interfaces precisely 
//because they don't assume anything about the class using them.
interface Aj
{
	void show();
	default void hike()//default method in interface
	{
	System.out.println("Hikingg");
	}
	static void jog()//static method in interface
	{
		System.out.println("Joggingg");

	}
//	public void run()
//	{
//		System.out.println("Running");
//	}
}
//class B extends Aj
//{
//	public void show()
//	{
//		System.out.print("Jaii");
//	}
//}
class Bj implements Aj
{
	public void show()
	{
		System.out.println("Showing");
	}
	public void hike()//overriding the default method
	{
		System.out.println("Showing + hiking");

	}

	
}

public class DeVsSt {

	public static void main(String[] args) {
    Bj obj = new Bj();
//   	public void show()
//   	{
//		System.out.print("Jaii");
//   	}
//	};
    Aj.jog();
    obj.hike();
	obj.show();
//	obj.run();
 
}
}
