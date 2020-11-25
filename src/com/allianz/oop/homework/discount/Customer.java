package com.allianz.oop.homework.discount;

public class Customer {
	private String name;
	private String memberType;
	private boolean member = false;
	
	public Customer(String name, String type) {
		this.name = name;
		this.memberType = type;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String type) {
		this.memberType = type;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", memberType=" + memberType + ", member=" + member + "]";
	}
	
	
}
