package com.allianz.oop.homework.discount;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name, String type, Date date) {
		customer = new Customer(name, type);
		this.date = new Date();
	}
	
	public String getName() {
		return customer.getName();
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double getTotalExpense() {
		if(customer.isMember() == true) {
			DiscountRate rate = new DiscountRate();
			return (productExpense * (1 - rate.getProductDiscountRate(customer.getMemberType())))
					+ (serviceExpense * (1 - rate.getServiceDiscountRate(customer.getMemberType())));
		} else {
			return productExpense + serviceExpense; 
		}
	}

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}
	
	
}
