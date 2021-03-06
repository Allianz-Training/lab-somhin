package com.allianz.oop;

//CLASS = Item
//Property
//- Item_url
//- Item_img_url
//- Item_title
//- Item_ID
//- Item_seller
//- Item_badge (Highlight, discount, promotion % off)
//- Item_Price
//- Item_discount (true, false)
//- Item_discount_price
//- Item_favorite
//- Item_rating
//- Item_sold
//- Item_seller_location
//
//Methods
//- Click > go to Item_url
//- Choose sub item > add Item_ID, Item_ID_SubID
//- Add to cart > add Item_title, Item_ID, Item_url to CART > add Buyer, Item_amount, etc.
//- Buy now > add Item_title, Item_amount > go to Checkout page
//- Add to favorite > add Item_ID to Buyer_Account_Favorite_List
//- Add comment > add Item_ID > Item_Comment (Author, time, comment)


public class Employee {
	public String firstname;
	public String lastname;
	public String position;
	
	private int salary;
	
	public static int freeBeerLeft = 20;
	public static boolean newEmployee = true;
	
	public static void main(String[] args) {
//		#1 new instance
//		Employee em1 = new Employee("somhin", "phipat", "Front-End Developer", 50000);
//		#try executing methods
//		em1.hello();
//		System.out.println(em1.getSalary());
//		em1.getPosition();
//		
//		#2 new instance
//		Employee em2 = new Employee("Phipat", "Limprasutr", "Janitor", 100000);
//		System.out.println(em2.getFullName());
//		System.out.println(em2.isANewEmployee());
//		System.out.println(em2.getBeer());
		
//		Arrays constructor
//		Employee[] employees = new Employee[3];
//		for (int i = 0; i < employees.length; i++) {
//			employees[i] = new Employee("First name " + i, "last " + i, "position " + i, 10000 * i);
//		}
//		
//		System.out.println(employees[1].firstname);
//		System.out.println(employees[2].firstname);
//		System.out.println(employees[1].getFullName());
//		System.out.println(employees[1].position);
		
//		Class structure (Extended Class)
		
	}
	
//	
//	Constructor
	public Employee(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		position = positionInput;
		salary = salaryInput;
	}
	
//	
//	Methods
	public void hello() {
		System.out.println("Hello " + firstname);
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void getPosition() {
		System.out.println(firstname + " position is: " + position);
	}
	
	public String getFullName() {
		return firstname + " " + lastname;
	}
	
	public static int getBeer() {
		return freeBeerLeft;
	}
	
	public static boolean isANewEmployee() {
		return newEmployee;
	}
	
}