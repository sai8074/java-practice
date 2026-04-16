package power_pro;

class Normal {
	int num;
	static String name = "Nani";

	public void run() {//Normal method
		System.out.println("Runnn" + " " + name);
	}
	public static void jai()//static method
	{
		System.out.println("Jaiii");

	}
}

public class StaticEx {

	public static void main(String[] args) {
		//the main method will be static because no need to create separate instance as it is belonged to 
		//class itself
		Normal n = new Normal();
		n.num = 2;
		Normal.name = "Saii";
		n.run();
		
		System.out.println(n.num);
        Normal.jai();//static method calling
	}

}
