package com.nt;

public class DemoTest implements GetInformation {

	public static void main(String[] args) {
		DemoTest test = new DemoTest();

		System.out.println(test.showName());
		System.out.println(test.showSurname());
		System.out.println(GetInformation.showCity());
		GetInformation obj = () -> {
			return "hii";
		};

		System.out.println(obj.showName());
	}

	@Override
	public String showName() {
		return "Ankur";
	}

	@Override
	public String showSurname() {
//		return GetInformation.super.showSurname();
		return "subclass method";
	}

}