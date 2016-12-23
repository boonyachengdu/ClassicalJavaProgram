package com.boonya.program.compare;

import java.util.ArrayList;

import org.junit.Test;

public class SortByFieldTest {
	
	@Test
	public void sortTest(){
		ArrayList<Person> persons = new ArrayList<Person>();
		Person p1 = new Person(1, "Allen", 12, "Allen@support.com", "New York");
		Person p2 = new Person(5, "Bob", 9, "Bob@support.com", "Atlantic");
		Person p3 = new Person(2, "Author", 20, "Author@support.com", "Washington");
		Person p4 = new Person(3, "Peter", 30, "Peter@support.com", "Los Angilis");
		Person p5 = new Person(4, "Mercy", 21, "Mercy@support.com", "San Fransisco");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		
		SortByField.sortByField(persons, "address", "asc");
		
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
	}

}
