package TOLLBOOTH;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> std=new ArrayList<Student>();
		Student s=new Student(101,"Deepankar","B.Tech",199);
		Student s1=new Student(102,"Raj","B.Tech",156);
		Student s2=new Student(103,"Ram","Bsc",176);
		Student s3=new Student(104,"john","M.Tech",186);
		Student s4=new Student(105,"Mike","B.Ed",108);
		
		std.add(s);std.add(s1);std.add(s2);std.add(s3);std.add(s4);
		System.out.println("*** Unsort student *****");
		System.out.println("Roll No Name	Course 	Marks");
		for(Student ss:std)
		{
			System.out.println(ss.rollno+" 	"+ss.name+" 	"+ss.course+" 	"+ss.marks);	
		}
		
		Collections.sort(std);
		System.out.println();
		System.out.println("**** Sort Student by marks ****");
		System.out.println("Roll No Name	Course 	Marks");
		for(Student ss:std)
		{
			System.out.println(ss.rollno+" 	"+ss.name+" 	"+ss.course+" 	"+ss.marks);
		}
		

	}

}
