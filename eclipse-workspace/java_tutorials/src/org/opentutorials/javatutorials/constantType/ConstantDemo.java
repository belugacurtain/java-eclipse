package org.opentutorials.javatutorials.constantType;

public class ConstantDemo {

	public static void main(String[] args) {
		int a = 3;
		float b = 1.0F;
		double c = a + b;
		System.out.println(c);
		
		float gunami_a = (float)100.0;
		int gunami_b = (int)100.0F;
		System.out.println("명시적형변환");
		System.out.println(gunami_a);
		System.out.println(gunami_b);
		
	}
}
