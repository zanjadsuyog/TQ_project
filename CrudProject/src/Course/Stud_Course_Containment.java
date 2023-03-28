package Course;

import java.util.Scanner;

public class Stud_Course_Containment {

	static Scanner sc = new Scanner(System.in);

	public static void addStudent(Student s1) {

		System.out.println("Enter the Student Details: ");
		System.out.println("Enter the Id: ");
		s1.setId(sc.nextInt());

		System.out.println("Enter the Student name: ");
		s1.setNameString(sc.next());

		System.out.println("Enter the Student age : ");
		s1.setAge(sc.nextInt());

		System.out.println("Enter the course Details:  ");
		Course c1 = new Course();
		System.out.println("Enter the course id: ");
		c1.setCid(sc.nextInt());

		System.out.println("Enter the course name: ");
		c1.setCname(sc.next());
		System.out.println("enter the fees: ");
		c1.setFees(sc.nextFloat());
		System.out.println("********************");
	}

	public static void main(String[] args) {

		Stud_Course_Containment cDb = new Stud_Course_Containment();

		Student s1[] = new Student[3];
		for (int i = 0; i <= s1.length; i++) {

			s1[0] = new Student();
			addStudent(s1[0]);
			System.out.println(s1[0]);

		}
	}

}
