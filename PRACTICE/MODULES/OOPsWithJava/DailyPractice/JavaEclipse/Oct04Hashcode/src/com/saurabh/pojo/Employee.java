package com.saurabh.pojo;
import java.util.Objects;
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
		int readyHash = Objects.hash(id, name);
		System.out.println("ReadyHash : " + readyHash);
		int result = 1;
//		result = 31 * result + (this.getId() == null ? 0 : this.getId().hashCode());
//		result = 31 * result + (this.getName() == null ? 0 : this.getName().hashCode());
		result = 31 * result + (id == null ? 0 : id.hashCode());
		result = 31 * result + (name == null ? 0 : name.hashCode());
		System.out.println("Result is : " + result);
		return result;
	}
}
