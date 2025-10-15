package com.example.demo.entity;

public class Student {

	private String sName;
	private String sAddress;
	private String sSchoolName;
	private int sAge;
	private int sRollNo;
	private char sDiv;
	
	
	public String getName()
	{
		return sName;
	}
	public void setsName(String sName)
	{
		this.sName = sName;
	}
	
	
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	
	public String getsSchoolName() {
		return sSchoolName;
	}
	public void setsSchoolName(String sSchoolName) {
		this.sSchoolName = sSchoolName;
	}
	
	
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	
	public int getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	
	
	public char getsDiv() {
		return sDiv;
	}
	public void setsDiv(char sDiv) {
		this.sDiv = sDiv;
	}
	
	
	
	
}
