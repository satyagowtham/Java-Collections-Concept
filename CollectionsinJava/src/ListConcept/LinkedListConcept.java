package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("test");
		ll.add("SI");
		ll.add("Police");
		
		System.out.println("LinkedList Concept...."+ ll);
		// add first
		ll.addFirst("Gowtham SI");
		// add last
		ll.addLast("Goal will be reached");
		System.out.println("LinkedList after adding...."+ll);
		
		// get
		System.out.println(ll.get(4));
		for(int i =0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		// Set
		ll.set(0, "Home");
		System.out.println(ll.get(0));
		
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("LinkedList Concept!!!!"+ ll);
		
		ll.remove(2);
		System.out.println("LinkedList !!@@"+ ll);
		
		// How to print all the values?
		// 1. for loop
		// 2. advance for loop
		System.out.println("using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		// 3. iterator
		System.out.println("Using iterator...");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// 4. while loop
		
		System.out.println("Using while loop.......");
		
		int num = 0;
		while(ll.size()>0) {
			System.out.println(ll.get(num));
			num++;
		}
		
		

	}

}
