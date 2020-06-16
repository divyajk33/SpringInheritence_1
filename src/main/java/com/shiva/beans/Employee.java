package com.shiva.beans;

public class Employee {
	private int eno;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String ename;
	private double sal;
	private String desig;
	private String hno;
	private String city;
	public void displayEmpDetails()
	{
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(desig);
		System.out.println(hno);
		System.out.println(city);
	}
}
