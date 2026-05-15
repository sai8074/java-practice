package power_pro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayLinked {

	public static void main(String[] args) {
     List<Integer> num = new ArrayList<Integer>();
     num.add(2);
     num.add(23);
     num.add(42);
     num.add(26);

     System.out.println(num.get(2));//To get element at specified index
     System.out.println(num.indexOf(2));//To get the index of specified element
     System.out.println(num);
     
     for (int i : num)
     {
    	 System.out.println(i);
     }
     
     Set<String> Name = new HashSet<String>();
     Name.add("Nani");
     Name.add("Sai");
     Name.add("Nani");
     System.out.println(Name);
     for (String s : Name)
     {
         System.out.println(s);
 
     }
     }
}
