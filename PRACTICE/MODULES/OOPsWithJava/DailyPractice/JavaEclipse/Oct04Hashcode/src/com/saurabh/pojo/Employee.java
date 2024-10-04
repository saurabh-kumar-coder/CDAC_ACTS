package com.saurabh.pojo;

public class Employee {
	public Integer id;
	public String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		int hashCode = getId().hashCode();
//		System.out.println("HashCode : " + hashCode);
		int result = 1;
		result = 31 * result + (getId() == null ? 0 : getId().hashCode());
		result = 31 * result + (getName() == null ? 0 : getName().hashCode());
		System.out.println("Result is : " + result);
		return super.hashCode();
	}
}
