package com.hari.training;

import java.util.Vector;
public class TestEmployeeCollection {
	public static void main(String[] args) {
		Vector<Employee> v = addInput();
		display(v);
		}

	private static Vector<Employee> addInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void display(Vector<Employee> v) {
		// TODO Auto-generated method stub
		
	}

	public static void main1(String[] args) {
		Employee e1=new Employee (101,"sunny", "airala");
		Employee e2=new Employee (102,"sasank", "reddy");
		Employee e3=new Employee (103,"airala", "sasank");
		Vector<Employee> v=new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}
	public static void main11(String[] args) {
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}
}