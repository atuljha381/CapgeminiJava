package com.lambda;

import java.util.ArrayList;

public class StudentLambdaHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1, "Rajesh", 76, 87));
		students.add(new Student(2, "Kamlesh", 45, 55));
		students.add(new Student(3, "Shivam", 55, 75));
		students.add(new Student(4, "Deepak", 96, 89));
		students.add(new Student(5, "Rahul", 84, 86));

		System.out.println("Number of students: " + students.stream().filter(s -> s.getSname().contains("a")).count());

		Student st = students.stream().max((s1, s2) -> s1.getSub1() > s2.getSub1() ? 1 : -1).get();
		System.out.println("Highest Marks in Sub1: " + st.getSname() + " " + st.getSub1());

		st = students.stream().min((s1, s2) -> s1.getSub1() > s2.getSub1() ? 1 : -1).get();
		System.out.println("Lowest Marks in Sub1: " + st.getSname() + " " + st.getSub1());

		students.stream().filter(s -> s.getSub1() > 60).forEach(s -> s.show());

		students.stream().peek(Student::show).map(s -> (s.getSub1() + s.getSub2()))
				.forEach(s -> System.out.println("Total Marks: " + s));

	}

}
