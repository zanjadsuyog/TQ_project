package Course;

public class Student {

	private int id;
	private String name;
	private int age;
//	private Course course;

	public Student()
	{
		
	}
	

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	//	this.course = course;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setNameString(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


//	public Course getCourse() {
//		return course;
//	}
//
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}


	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", age=" + age  ;
	}
	
}

   
	