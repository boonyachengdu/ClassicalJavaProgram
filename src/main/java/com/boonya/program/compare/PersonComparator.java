package com.boonya.program.compare;

import java.util.Comparator;
/**
 * 比较器PersonComparator
 * 
 * @package com.boonya.program.compare.PersonComparator
 * @date   2016年12月23日  上午10:56:53
 * @author pengjunlin
 * @comment   
 * @update
 */
public class PersonComparator implements Comparator<Person> {

	private String sortFieldName;

	private SortEnum sortEnum;

	public String getSortFieldName() {
		return sortFieldName;
	}

	public void setSortFieldName(String sortFieldName) {
		this.sortFieldName = sortFieldName;
	}

	public SortEnum getSortEnum() {
		return sortEnum;
	}

	public void setSortEnum(SortEnum sortEnum) {
		this.sortEnum = sortEnum;
	}

	public PersonComparator() {
		super();
	}

	public PersonComparator(SortEnum sortEnum) {
		super();
		this.sortEnum = sortEnum;
	}

	public PersonComparator(String sortFieldName, SortEnum sortEnum) {
		super();
		this.sortFieldName = sortFieldName;
		this.sortEnum = sortEnum;
	}

	@Override
	public int compare(Person o1, Person o2) {
		if (sortFieldName == null) {
			if (sortEnum == SortEnum.DESC) {
				return o2.compareTo(o1);
			} else {
				return o1.compareTo(o2);
			}
		} else {
			if (sortEnum == SortEnum.DESC) {
				if (sortFieldName.equals("id")) {
					long val = o2.getId() - o1.getId();
					if (val < 0)
						return 1;
					else if (val > 0)
						return -1;
					else
						return 0;
				} else if (sortFieldName.equals("name")) {
					return o2.getName().compareTo(o1.getName());
				} else if (sortFieldName.equals("age")) {
					int val = o2.getAge() - o1.getAge();
					if (val < 0)
						return 1;
					else if (val > 0)
						return -1;
					else
						return 0;
				} else if (sortFieldName.equals("email")) {
					return o2.getEmail().compareTo(o1.getEmail());
				} else if (sortFieldName.equals("address")) {
					return o2.getAddress().compareTo(o1.getAddress());
				}
				return o2.compareTo(o1);
			} else {
				if (sortFieldName.equals("id")) {
					long val = o1.getId() - o2.getId();
					if (val > 0)
						return 1;
					else if (val < 0)
						return -1;
					else
						return 0;
				} else if (sortFieldName.equals("name")) {
					return o1.getName().compareTo(o2.getName());
				} else if (sortFieldName.equals("age")) {
					int val = o1.getAge() - o2.getAge();
					if (val > 0)
						return 1;
					else if (val < 0)
						return -1;
					else
						return 0;
				} else if (sortFieldName.equals("email")) {
					return o1.getEmail().compareTo(o2.getEmail());
				} else if (sortFieldName.equals("address")) {
					return o1.getAddress().compareTo(o2.getAddress());
				}
				return o1.compareTo(o2);
			}

		}

	}

}
