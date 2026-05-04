package power_pro;
//---String
//Strings (java.lang.String) are pieces of text stored in your program. Strings are not a primitive data type in Java,
//however, they are very common in Java programs.
//In Java, Strings are immutable, meaning that they cannot be changed
//--------------------------------------
//--String Buffer
//used to created mutable (modifiable) string.
//Mutable: Which can be changed.
//is thread-safe i.e. multiple threads cannot access it simultaneously.
//---------------------------------------
//Main difference between StringBuffer vs StringBuilder is first is thread safe other is not.
class Stringg
{
	String S = "Nani";
	StringBuffer V = new StringBuffer("Reddy");
}

public class StringVsStringBuffer {

	public static void main(String[] args) {
    Stringg Z = new Stringg();
    System.out.println(Z.S.length());
    System.out.println(Z.V.capacity());

	}

}
