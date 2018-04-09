// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************

import console.*;

public class Grades {
	public static void main(String... args) {
		Student student1 = new Student(Console.promptString("Enter Student 1's name: "));
		Student student2 = new Student(Console.promptString("Enter Student 2's name: "));

		student1.inputGrades();
		student1.getAverage();

		System.out.println();

		student2.inputGrades();
		student2.getAverage();

		System.out.println("Student 1: " + student1);
		System.out.println("Student 2: " + student2);
	}
}