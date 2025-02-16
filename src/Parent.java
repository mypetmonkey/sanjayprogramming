
public class Parent {
	
	public static void method() {
		System.out.println("parent method");
	}

}
class Child extends Parent{
	
	public static void method() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		
	Child.method();
		
	}
}
