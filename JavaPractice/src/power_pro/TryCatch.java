package power_pro;

public class TryCatch {

	public static void main(String[] args) {
    int i = 10;
    try 
    {
    	int res = i/0 ;
    	throw new ArithmeticException("Division with zero");
    }
    catch(ArithmeticException e)
    {
     System.out.println("Division with zero");
    }
    
	}

}
