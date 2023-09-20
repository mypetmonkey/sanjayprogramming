package com.NumberSystemSanjaysir;

public class Parent {
	public void m1() {
		System.out.println("parent method");
	}

}
class Child extends Parent{
	public static void main(String[] args) {
		Parent p=new Parent();
		p.m1();
		Child c=new Child();
		c.m1();
	}
	public void m1() {
		System.out.println("child method");
	}
}