package com.collection.jan11;

public class Student {

			private String name;
			private int rollno;
			private int age;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getRollno() {
				return rollno;
			}
			public void setRollno(int rollno) {
				this.rollno = rollno;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Student() {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
			}
			public Student(String name, int rollno, int age) {
				super();
				this.name = name;
				this.rollno = rollno;
				this.age = age;
			}
			
			
}
