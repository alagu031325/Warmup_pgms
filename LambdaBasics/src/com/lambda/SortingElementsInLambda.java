/**
 * 
 */
package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import com.customizedObjects.Person;

/**
 * @author alagu
 *
 */
public class SortingElementsInLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int totalNumberOfPersons = 0;
		/*
		 * String tempFirstName; String tempLastName; String tempCourseOpted; int
		 * tempAge;
		 */
		int tempValue = 1;
		int switchValue = 0;
		char userResponse;
		String userCourse;
		Scanner scannerInstance = new Scanner(System.in);
		System.out.println("Sorting Program");
		System.out.println("Enter the number of persons to be sorted");
		totalNumberOfPersons = scannerInstance.nextInt();
		List<Person> peopleList = new ArrayList<>(totalNumberOfPersons);

		while (tempValue <= totalNumberOfPersons) {
			System.out.println("Enter the FirstName, LastName, CourseOpted and Age of " + tempValue
					+ " person separated by spaces");
			Person people = new Person();
			try {
				people.setFirstName(scannerInstance.next());
				people.setLastName(scannerInstance.next());
				people.setCourseOpted(scannerInstance.next());
				people.setAgeOfPerson(scannerInstance.nextInt());
			} catch (Exception e) {
				System.out
						.println("Spaces are not allowed within individual values," + "\n" + "Kindly retype the input");
				break;
			}
			peopleList.add(people);
			tempValue++;
		}
		do {
			System.out.println("Choose one from the list of operations that can be performed" + "\n"
					+ "1.Sort in ascending order by last name" + "\n" + "2.Sort in descending order by first name"
					+ "\n" + "3.Count number of persons in specified course" + "\n" + "4.print all elements" + "\n"
					+ "5.To retrieve records that match the given character in firstname");
			switchValue = scannerInstance.nextInt();
			switch (switchValue) {
			case 1:
				Collections.sort(peopleList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
				printAllElements(peopleList, p -> true);
				break;
			case 2:
				Collections.sort(peopleList, (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName()));
				printAllElements(peopleList, p -> true);
				break;
			case 3:
				System.out.println("Enter the name of the course to be sorted");
				userCourse = scannerInstance.next();
				int courseCount = 0;
				for (Person people : peopleList)
					if (people.getCourseOpted().equals(userCourse))
						courseCount++;
				System.out.println("The number of persons opted " + userCourse + " is " + courseCount);
				break;
			case 4:
				printAllElements(peopleList, p -> true);
				break;
			case 5:
				System.out.println("Enter the beginning character");
				String startPrefix = scannerInstance.next();
				printAllElements(peopleList, p1 -> p1.getFirstName().startsWith(startPrefix));
				break;
			default:
				System.out.println("Enter a valid integer");
				break;
			}
			System.out.println("Do you want to continue type y/n");
			userResponse = scannerInstance.next().charAt(0);
		} while (userResponse == 'y');
		System.out.println("See you soon");
	}

	private static void printAllElements(List<Person> peopleList, Predicate<Person> checkRecord) {
		for (Person people : peopleList)
			if (checkRecord.test(people))
				System.out.println(people);
	}
}
