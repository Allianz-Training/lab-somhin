package com.allianz.oop;

public class EmployeeSpecial extends Employee {

	public String specialSkill;
	
	public static void main(String[] args) {
		EmployeeSpecial emS1 = new EmployeeSpecial("Super", "somfuckinghin", "Janitor", 100, "sleep");
		emS1.showSkill();
	}

	public EmployeeSpecial(String firstnameInput, String lastnameInput, String positionInput, int salaryInput,
			String specialSkillInput) {
		
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
		this.specialSkill = specialSkillInput;

	}
	
	public void showSkill() {
		System.out.println(firstname + " " + lastname + "'s special skill is " + specialSkill);
	}

}
