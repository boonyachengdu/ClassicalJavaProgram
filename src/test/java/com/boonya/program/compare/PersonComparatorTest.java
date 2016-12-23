package com.boonya.program.compare;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
/**
 * 比较器测试
 * 
 * @package com.boonya.program.compare.PersonComparatorTest
 * @date   2016年12月23日  上午10:58:06
 * @author pengjunlin
 * @comment   
 * @update
 */
public class PersonComparatorTest {

	@Test
	public void sortAscTest() {
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
		
		System.out.println(">>>>========sort by id asc===========<<<<"); 
		PersonComparator comparator=new PersonComparator(SortEnum.ASC);

		Collections.sort(persons, comparator);// 用我们写好的Comparator对persons进行排序
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
	}
	
	@Test
	public void sortDescTest() {
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
		
		System.out.println(">>>>========sort by id desc===========<<<<"); 
		PersonComparator comparator=new PersonComparator(SortEnum.DESC);

		Collections.sort(persons, comparator);// 用我们写好的Comparator对persons进行排序
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
	}
	
	@Test
	public void sortByFieldAscTest() {
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
		
		System.out.println(">>>>========sort by name asc===========<<<<"); 
		PersonComparator comparator=new PersonComparator("name",SortEnum.ASC);

		Collections.sort(persons, comparator);// 用我们写好的Comparator对persons进行排序
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
		
		System.out.println(">>>>========sort by age asc===========<<<<"); 
		PersonComparator comparator2=new PersonComparator("age",SortEnum.ASC);

		Collections.sort(persons, comparator2);// 用我们写好的Comparator对persons进行排序
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
		
		System.out.println(">>>>========sort by email asc===========<<<<"); 
		PersonComparator comparator3=new PersonComparator("email",SortEnum.ASC);

		Collections.sort(persons, comparator3);// 用我们写好的Comparator对persons进行排序
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
		
		System.out.println(">>>>========sort by address asc===========<<<<"); 
		PersonComparator comparator4=new PersonComparator("address",SortEnum.ASC);

		Collections.sort(persons, comparator4);// 用我们写好的Comparator对persons进行排序
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
	}

}
