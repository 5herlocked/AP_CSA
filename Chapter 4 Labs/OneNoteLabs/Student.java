// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.*;
import console.*;
public class Student {
	private Scanner inScan = new Scanner (System.in);
	private double score1 = 0;
	private double score2 = 0;
	private String name = "";

	//-----------------------------------------------
	//constructor
	//-----------------------------------------------
	public Student(String studentName) {
		name = studentName;
	}

	//-----------------------------------------------
	//inputGrades: prompt for and read in student's grades for test1 and test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	//-----------------------------------------------
	public void inputGrades() {
		score1 = Console.promptDouble("Enter " + name + "'s Score in the 1st Test");
		score2 = Console.promptDouble("Enter " + name + "'s Score in the 2nd Test");
	}

	//-----------------------------------------------
	//getAverage: compute and return the student's test average
	//-----------------------------------------------
	public double getAverage() {
		return (score1+score2)/2;
	}

	//-----------------------------------------------
	//getName: print the student's name
	//-----------------------------------------------
	public void printName () {
		System.out.println ("Student: " + name);
	}

	public String toString() {
		return "Name: " + name + "\t\tTest 1: " + score1 + "\t\tTest 2: " + score2 + "\t\tAverage: " + getAverage();
	}
}