package com.allianz.abstract__enum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.allianz.abstract__enum.Creatures__Enum.Dawg__Status;

public class GOD {

	public static void main(String[] args) {
//		Dawg somhin = new Dawg();
//		somhin.type = Dawg__Status.DANGEROUS_DAWG;
//		System.out.println(somhin.type);
		
//		String f1 = "hin";
//		String f2 = "somhin";
//		String f3 = "somfuckinghin";
//		ArrayList<String> friends = new ArrayList<String>();
//		friends.add(f1);
//		friends.add(f2);
//		friends.add(f3);
//		System.out.println(friends);
//		
//		for (String c : friends) {
//			System.out.println(c + " says hi!");
//		}
//		
//		friends.remove(f2);
//		System.out.println(friends);
		
		Dawg d1 = new Dawg("somhin");
		Dawg d2 = new Dawg("somfuckinghin");
		
		ArrayList<Dawg> dawgs = new ArrayList<Dawg>();
		dawgs.add(d1);
		dawgs.add(d2);
		
		for (Dawg dawg : dawgs) {
			System.out.println("dawg name's " + dawg.getName());
		}
		
		System.out.println("");
		System.out.println("==========================================");
		System.out.println("");
		
		HashMap<String, Dawg> dawgsOwner = new HashMap<>();
		dawgsOwner.put("MOM", d1);
		dawgsOwner.put("DAD", d2);
		System.out.println(dawgsOwner);
		
		
	}
}
