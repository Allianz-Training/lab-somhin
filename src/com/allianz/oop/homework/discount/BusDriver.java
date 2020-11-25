package com.allianz.oop.homework.discount;

public class BusDriver {
	public static void main(String[] args) {
		System.out.println("=================================================================");
		System.out.println("New instance name 'Somhin'");
		Customer somhin = new Customer("Somhin", "Premium");
		System.out.println("=================================================================");
		System.out.println("1.In Customer class, excute method getName():   " + somhin.getName());
		System.out.println("2.In Customer class, excute method isMember():   " + somhin.isMember());
		somhin.setMember(true);
		System.out.println("2.In Customer class, after excute method setMember(true):   " + somhin.isMember());
		System.out.println("2.In Customer class, excute method getMemberType():   " + somhin.getMemberType());
		somhin.setMemberType("Gold");
		System.out.println("2.In Customer class, excute method getMemberType():   " + somhin.getMemberType());
		System.out.println("=================================================================");
		Visit visit1 = new Visit("Somfuckinghin", "Gold", null);
		System.out.println("New instance name 'Somfuckinghin'");
		System.out.println("In Visit class, excute method getName():   " + visit1.getName());
		System.out.println("In Visit class, excute method getServiceExpense():   " + visit1.getServiceExpense());
		visit1.setServiceExpense(1000);
		System.out.println("In Visit class, after setServiceExpense(1000), excute getServiceExpense:   " + visit1.getServiceExpense());
		System.out.println("In Visit class, excute method getServiceExpense():   " + visit1.getProductExpense());
		visit1.setProductExpense(1500);
		System.out.println("In Visit class, after setProductExpense(1500), excute getProductExpense:   " + visit1.getProductExpense());
		System.out.println("In Visit class, excute method getTotalExpense():   " + visit1.getTotalExpense());
		
		System.out.println("In Visit class, excute method toString():   " + visit1.toString());
		System.out.println("=================================================================");
		DiscountRate discountRate = new DiscountRate();
		System.out.println("Premium Service Discount Rate: " + discountRate.getServiceDiscountRate("Premium"));
		System.out.println("Gold Service Discount Rate: " + discountRate.getServiceDiscountRate("Gold"));
		System.out.println("Silver Service Discount Rate: " + discountRate.getServiceDiscountRate("Silver"));
		System.out.println("=================================================================");
		Visit visit2 = new Visit("Nong Hin", "Premium", null);
		visit2.getCustomer().setMember(true);
		visit2.setServiceExpense(150);
		visit2.setProductExpense(100);
		System.out.println(visit2);
		System.out.println("Total Expense: " + visit2.getTotalExpense());
	}
	
}
