package com.nt.test;

public class TestApp {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int add=cal.add(20, 30);
		System.out.println("addition is"+add);
		int sub=cal.sub(30,20);
		System.out.println("Substraction is"+sub);
		int mul=cal.mul(20, 30);
		System.out.println("multiplication is"+mul);
		int div=cal.div(40, 30);
		System.out.println("divition is"+div);
		int per=cal.per(20, 30);
		System.out.println("percentage is"+per);
		System.out.println("i have done calculation Application");
		

	}

}
