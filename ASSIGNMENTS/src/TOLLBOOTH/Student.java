package TOLLBOOTH;

public class Student implements Comparable<Student> 
{
	int rollno;
	String name;
	String course;
	int marks;
	
	public Student(int rollno, String name, String course, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if(marks==o.marks)
			return 0;
		else if(marks>=o.marks)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getMarks() {
		return marks;
	}

}
