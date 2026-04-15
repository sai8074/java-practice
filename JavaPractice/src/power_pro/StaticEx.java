/**
 * 
 */
package power_pro;
class Normal
{
		int num;
		String name;
		
		
		public void run()
		{
			System.out.println("Runnn");
		}
	}
/**
 * 
 */
public class StaticEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Normal n = new Normal();
				n.num = 2;
				n.run();
				System.out.println(n.num);

	}

}
