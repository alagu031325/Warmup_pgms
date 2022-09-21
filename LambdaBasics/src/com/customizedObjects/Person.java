/**
 * 
 */
package com.customizedObjects;

/**
 * @author alagu
 * Person object used for sorting 
 */
public class Person {

	//Variables defined in Person class
	private String firstName;
	private String lastName;
	private int ageOfPerson;
	private String courseOpted;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the ageOfPerson
	 */
	public int getAgeOfPerson() {
		return ageOfPerson;
	}
	/**
	 * @param ageOfPerson the ageOfPerson to set
	 */
	public void setAgeOfPerson(int ageOfPerson) {
		this.ageOfPerson = ageOfPerson;
	}
	/**
	 * @return the courseOpted
	 */
	public String getCourseOpted() {
		return courseOpted;
	}
	/**
	 * @param courseOpted the courseOpted to set
	 */
	public void setCourseOpted(String courseOpted) {
		this.courseOpted = courseOpted;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", ageOfPerson=" + ageOfPerson
				+ ", courseOpted=" + courseOpted + "]";
	}
	
}
