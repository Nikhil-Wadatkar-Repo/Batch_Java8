package com.nt.test;

interface I1 {
	public void methodOne();
}

interface I2 {
	public void methodOne();
}

interface I3 extends I1, I2 {
}

public class AmbiguityDemo implements I3 {
	@Override
	public void methodOne() {
		System.out.println("Implementeation");

	}

	public static void main(String[] args) {
		new AmbiguityDemo().methodOne();
	}

}
