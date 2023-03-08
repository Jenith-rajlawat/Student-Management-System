package com.StudentApplication;

public class Student {
      	private int id;
      	private String name;
      	private int grade;
      	private int age;
      	
      	public Student() {
      		
      	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", age=" + age + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
