package com.ra2.Model;

public class Customer {
	private long id;
    private String firstName, lastName, course;
    private int age, enlistment_year;
    
    public Customer() {
    	
    }

    public Customer(long id, String firstName, String lastName, String course, int age, int enlistment_year) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.course = course;
      this.age = age;
      this.enlistment_year = enlistment_year;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEnlistment_year() {
		return enlistment_year;
	}

	public void setEnlistment_year(int enlistment_year) {
		this.enlistment_year = enlistment_year;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", course=" + course
				+ ", age=" + age + ", enlistment_year=" + enlistment_year + "]";
	}
}
