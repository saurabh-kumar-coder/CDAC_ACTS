package com.saurabh.pojo;

public class Fruit {
	private String color;
	private String taste;
	private double weight;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String color, String taste, double weight) {
		super();
		this.color = color;
		this.taste = taste;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", taste=" + taste + ", weight=" + weight + "]";
	}
}