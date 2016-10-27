package com.foo;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world main.");
	}

	public void coveredByUnitTest() {
		System.out.println("Hello, world.1");
		System.out.println("Hello, world.2");
	}

	public void notCoveredByUnitTest() {
		System.out.println("Hello, world.");
	}
}
