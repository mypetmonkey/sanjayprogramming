
public class OverrideEx {
	
	public static void method() {
		System.out.println("parent method");
	}

}
class Child extends OverrideEx{
	
	public static void method() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		
	Child.method();
		
	}
}
