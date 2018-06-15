package com.yy.model;

public class Ginfo {
	private int id;
	private String name;
	private int typeid;
	private double price;
	private int store;
	
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
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	@Override
	public String toString() {
		return "Ginfo [id=" + id + ", name=" + name + ", typeid=" + typeid + ", price=" + price + ", store=" + store
				+ "]";
	}
	public Ginfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ginfo(int id, String name, int typeid, double price, int store) {
		super();
		this.id = id;
		this.name = name;
		this.typeid = typeid;
		this.price = price;
		this.store = store;
	}
	
	

}
