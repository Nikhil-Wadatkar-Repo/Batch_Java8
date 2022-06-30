package com.nt;
@FunctionalInterface
public interface GetInformation {
	public String showName();

	default String showSurname() {
		return "Wadatkar";
	}

	static String showCity() {
		return "Hyderabad";
	}
}
