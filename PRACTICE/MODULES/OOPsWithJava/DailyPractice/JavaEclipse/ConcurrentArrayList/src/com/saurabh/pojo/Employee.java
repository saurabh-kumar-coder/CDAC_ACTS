package com.saurabh.pojo;

import java.time.LocalDate;

public class Employee {
	private Integer id;
	private String name;
	private LocalDate doj;

	private Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id) {
		super();
		this.id = id;
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(Integer id, String name, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
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

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}

	@Override
	public boolean equals(Object o) {
//		if (o instanceof Employee) {
//			Employee e = (Employee) o;
//			return (this.getId() == e.getId() && this.getName().equals(e.getName())
//					&& this.getDoj().equals(e.getDoj()));
//		}
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			return (this.getId() == e.getId() && this.getName().equals(e.getName()));
		}
//		if (o instanceof Employee) {
//			Employee e = (Employee) o;
//			return (this.getId() == e.getId());
//		}
		return false;
	}
}
