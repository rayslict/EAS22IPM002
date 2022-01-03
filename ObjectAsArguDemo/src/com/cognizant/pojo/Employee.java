package com.cognizant.pojo;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private double basicSalary;
	private double pf;
	private double tds;
	private double netSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int age, double basicSalary, double pf, double tds, double netSalary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.basicSalary = basicSalary;
		this.pf = pf;
		this.tds = tds;
		this.netSalary = netSalary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getTds() {
		return tds;
	}
	public void setTds(double tds) {
		this.tds = tds;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", basicSalary=" + basicSalary + ", pf=" + pf
				+ ", tds=" + tds + ", netSalary=" + netSalary + "]";
	}
	
	

}
