package power_pro;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
     int[] num = {12,23,44,45,56};
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int Snum = sc.nextInt();
     int index = -1;
     for(int i = 0 ;i < num.length ; i++)
     {
    	 if(num[i] == Snum)
    	 {
    	   index = i ;
    	   break;
    	 }
     }
     if(index != -1)
     {
    	 System.out.println("Found at" + " " + index);
     }
     else
     {
    	 System.out.println("Not Found");
     }
    sc.close();	 
                  
	}

}
