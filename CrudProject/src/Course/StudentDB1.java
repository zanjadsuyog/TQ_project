package Course;

import java.util.Scanner;

public class StudentDB1 {

	static Scanner sc = new Scanner(System.in);

	static int z = 0;

	public static void addStudent(Student stud) {

		System.out.println("Enter student id: ");
		stud.setId(sc.nextInt());
		System.out.println("Enter Student Name: ");
		stud.setNameString(sc.next());
		System.out.println("Enter Student age: ");
		stud.setAge(sc.nextInt());
		System.out.println("_________________________________");
	}

	public void updateStudent(Student s[], int sid) {
		for (int i = 0; i < z; i++) {
			if (s[i].getId() == sid) {
				System.out.println(s[i].getName() + " :" + s[i].getId() + ": " + s[i].getAge());

				System.out.println("Enter student  Name: ");
				String name = sc.next();
				s[i].setNameString(name);

				break;
			}

		}

	}

	public void deletestudent(Student[] s, int sid) {
		boolean flag = false;

		for (int i = 0; i < z; i++) {
			if (s[i].getId() == sid) {
				flag=true;
				System.out.println(s[i].getId() + " " + s[i].getName() + " " + s[i].getAge());
				for (int j = i; j < z - 1; j++) {
					s[j] = s[j + 1];
				}
				s[z - 1] = null;
				System.out.println("Student " + sid + " delete successfully");
				
				if(!flag)
				{
					System.out.println("Sudent not found");
				}
				break;
			}
		}

	}

	public void viewStudent(Student s[]) {
		for (int i = 0; i < z; i++) {
			System.out.println(s[i]);
		}
	}

	public void viewStudentByID(Student[] c, int cid) {
		for (int i = 0; i < z; i++) {
			if (c[i].getId() == cid)
				System.out.println(c[i].toString());
		}
	}

	public static void main(String[] args) {

		StudentDB1 sdb = new StudentDB1();

		Student s[] = new Student[10];

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			// System.out.println("----Welcome -----");
			System.out.println("****Choose Following Options:**** ");
			System.out.println("1.Add student");
			System.out.println("2.Update student");
			System.out.println("3.View student");
			System.out.println("4.View Student By Id");
			System.out.println("5.Delete student");
			System.out.println("-------------------------");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (z < s.length) {
					s[z] = new Student();
					sdb.addStudent(s[z]);
					z++;
				} else {
					System.out.println("you have already added maximum Student");
				}
				break;
			case 2:
				System.out.println("Enter Student Id to update :");
				int id = sc.nextInt();
				sdb.updateStudent(s, id);
				System.out.println("Student updated successfully!");
				break;

			case 3:
				sdb.viewStudent(s);
				break;

			case 4:
				System.out.println("Enter Id for View Student");
				int sid = sc.nextInt();
				sdb.viewStudentByID(s, sid);
				break;

			case 5:
				System.out.println("Enter Id for delete");
				int sid1 = sc.nextInt();
				sdb.deletestudent(s, sid1);
				break;

			case 6:
				System.out.println("Invalid Input");

			}
			System.out.println("Do you want to perform more operation Yes-1/No-0");
			choice = sc.nextInt();
		} while (choice == 1);

	}

}
