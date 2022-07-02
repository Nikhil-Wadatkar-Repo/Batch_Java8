package com.nt;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	private int id;

	private String firstName;

	private String lastName;

	private int age;

	private String gender;

	private String role;

	private String yearOfJoining;

	private int salary;

	private String emailID;

	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(int id, String firstName, String lastName, int age, String gender, String role,
			String yearOfJoining, int salary, String emailID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.role = role;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.emailID = emailID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static List<EmployeeDetails> getEmployees() {
		List<EmployeeDetails> employeeList = new ArrayList();
		employeeList.add(new EmployeeDetails(12, "Ankur", "Wadatkar", 29, "M", "Doctor", "04/04/1996", 2500, "aw@gmal.com"));
		employeeList.add(new EmployeeDetails(13, "Kishor", "Wadatkar", 44, "M", "Managing Head", "04/04/1996", 1000, "kw@gmal.com"));
		employeeList.add(new EmployeeDetails(14, "Neelima", "Wadatkar", 34, "F", "Director", "04/04/1996", 5255, "nw@gmal.com"));
		employeeList.add(new EmployeeDetails(15, "Dhanashri", "Wadatkar", 87, "M", "Doctor", "04/04/1996", 4445, "dw@gmal.com"));
		employeeList.add(new EmployeeDetails(16, "Mandu", "Chaporkar", 45, "F", "Doctor", "04/04/1996", 4533, "mc@gmal.com"));
		employeeList.add(new EmployeeDetails(18, "Nana", "Deotale", 33, "M", "CA", "04/04/1996", 8678, "nd@gmal.com"));
		employeeList.add(new EmployeeDetails(19, "Ganesh", "Dadmal", 83, "M", "CA", "04/04/1996", 4534, "dd@gmal.com"));
		employeeList.add(new EmployeeDetails(12, "Sanket", "Dawande", 55, "M", "Security", "04/04/1996", 4534, "sd@gmal.com"));
		employeeList.add(new EmployeeDetails(22, "Krishna", "Kanth", 53, "M", "Security", "04/04/1996", 5345, "kk@gmal.com"));
		employeeList.add(new EmployeeDetails(32, "Deepak", "Pandey", 78, "M", "Security", "04/04/1996", 4538, "dp@gmal.com"));
		employeeList.add(new EmployeeDetails(42, "Vivek", "Mishra", 96, "M", "CA", "04/04/1996", 211, "mv@gmal.com"));
		employeeList.add(new EmployeeDetails(52, "Dhanu", "Wanakhade", 55, "M", "Skeeper", "04/04/1996", 788, "aff@gmal.com"));
		employeeList.add(new EmployeeDetails(62, "Shyam", "Raut", 55, "M", "Skeeper", "04/04/1996", 1200, "sr@gmal.com"));
		employeeList.add(new EmployeeDetails(92, "Shruti", "Kamble", 86, "F", "Skeeper", "04/04/1996", 1500, "sk@gmal.com"));
		employeeList.add(new EmployeeDetails(62, "Asad", "Mohammad", 32, "M", "Patient", "04/04/1996", 2000, "am@gmal.com"));
		employeeList.add(new EmployeeDetails(82, "Nikhil", "Wadatkar", 26, "M", "Patient", "04/04/1996", 4000, "nw@gmal.com"));
		employeeList.add(new EmployeeDetails(12, "Gargi", "Garge", 79, "F", "BE", "04/04/1996", 10000, "gg@gmal.com"));
		employeeList.add(new EmployeeDetails(12, "John", "Kennedy", 78, "M", "BE", "04/04/1996", 15000, "jk@gmal.com"));
		employeeList.add(new EmployeeDetails(12, "Nepolian", "Hill", 88, "M", "BE", "04/04/1996", 5343, "nh@gmal.com"));
		
		return employeeList;
	}

}
