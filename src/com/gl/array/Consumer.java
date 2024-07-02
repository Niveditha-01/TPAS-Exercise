package com.gl.array;

public class Consumer {
	private String id;
	private String name;
	private Integer unitConsumed;
	private String finalPayment;
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(String id, String name, Integer unitConsumed, String finalPayment) {
		super();
		this.id = id;
		this.name = name;
		this.unitConsumed = unitConsumed;
		this.finalPayment = finalPayment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getUnitConsumed() {
		return unitConsumed;
	}
	public void setUnitConsumed(Integer unitConsumed) {
		this.unitConsumed = unitConsumed;
	}
	public String getFinalPayment() {
		return finalPayment;
	}
	public void setFinalPayment(String finalPayment) {
		this.finalPayment = finalPayment;
	}
	@Override
	public String toString() {
		String output = String.format("%-5s %-20s %-10s %-10s",id,name,unitConsumed,finalPayment);
		return  output;
	}
	
}