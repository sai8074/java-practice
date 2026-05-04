package power_pro;
interface C {
    default void greet() { System.out.println("Hello from A"); }
}

interface B {
    default void greet() { System.out.println("Hello from B"); }
}

class D implements C, B {
    @Override
    public void greet() {
        C.super.greet(); // explicitly choose one, or write your own
    }
}
public class DiamondP {

	public static void main(String[] args) {
    D n = new D();
    n.greet();
	}

}
