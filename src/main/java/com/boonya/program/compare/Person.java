package com.boonya.program.compare;

/**
 * 可比较排序Person
 * 
 * @package com.boonya.program.compare.ComparablePerson
 * @date 2016年12月23日 下午10:36:10
 * @author pengjunlin
 * @comment
 * @update
 */
public class Person implements Comparable<Person> {

	private long id;
	private String name;
	private int age;
	private String email;
	private String address;

	public Person(long id, String name, int age, String email,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public Person() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Person o) {
		if (this == o) {
			return 0;
		} else if (o != null && o instanceof Person) {
			Person u = (Person) o;
			if (id < u.id) {
				return -1;
			}else if(id == u.id){
				return 0;
			} else {
				return 1;
			}
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", email=" + email + ", address=" + address + "]";
	}
	
	

}
