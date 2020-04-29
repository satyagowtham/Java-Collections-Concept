package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		int a[] = new int[3]; // Static array
		
		// dynamic array----- ArrayList
		// 1. can contain duplicate values/elements
		// 2. maintains insertion order
		// 3. not synchronized
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());// Size of array
		System.out.println(ar.get(2));// to get the value from the index
		
		// To print all the values in arraylist we use for loop
		
		for(int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		Employee e1 = new Employee("Gowtham",26,"QA");
		Employee e2 = new Employee("Satya",26,"DEV");
		Employee e3 = new Employee("Kumar",26,"Admin");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// System.out.println(ar4);
		
		
		// iterator to traverse the values
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		// addAll
		ArrayList<String> ar5 = new ArrayList<String>();
		
		ar5.add("QTP");
		ar5.add("Selenium");
		ar5.add("Java");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Javascript");
		ar6.add("OTP");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("##################");
		// removeAll
		
		ar5.removeAll(ar6);
		for(int j=0; j<ar5.size(); j++) {
			System.out.println(ar5.get(j));
		}
		System.out.println("@@@@@@@@@@@@@");
		
		// retainAll
ArrayList<String> ar7 = new ArrayList<String>();
		
		ar7.add("QTP");
		ar7.add("Selenium");
		ar7.add("Java");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Javascript");
		ar8.add("QTP");
		
		ar7.retainAll(ar8);
		for(int k=0; k<ar7.size(); k++) {
			System.out.println(ar7.get(k));
		}
		

		}

	}


