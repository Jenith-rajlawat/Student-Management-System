package com.StudentApplication;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String name;
		int id;
		// TODO Auto-generated method stub
		StudentImplement dao=new StudentImplement();
		System.out.println("Welcome to Employee application");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1. Add Student\n" +
                    "2. Show All Student\n" +
                    "3. Show Student based on id \n" +
                    "4. Update the Student\n" +
                    "5. Delete the Student\n");
			System.out.println("Enter Choice: ");
			  int ch=sc.nextInt();
			  switch(ch) {
			  case 1:
				  Student stu=new Student();
				  System.out.println("Enter ID: ");
				   id=sc.nextInt();
				  System.out.println("Enter name: ");
				   name=sc.next();
				  System.out.println("Enter grade: ");
				  int grade=sc.nextInt();
				  System.out.println("Enter age: ");
				  int age=sc.nextInt();
				  stu.setId(id);
				  stu.setName(name);
				  stu.setGrade(grade);
				  stu.setAge(age);
				  dao.createStudent(stu);
				  break;
			  case 2:
				  dao.showAllStudent();
				  break;
			  case 3:
				  System.out.print("Enter id: ");
				  id=sc.nextInt();
				  dao.showStudentBasedOnID(id);
				  break;
				  
			  case 4:
				  System.out.print("Enter id:");
				   id=sc.nextInt();
				  System.out.print("Enter name:");
				   name=sc.next();
				  dao.updateStudent(id, name);
				  break;
			  
			  case 5:
				  System.out.print("Enter id: ");
				  id=sc.nextInt();
				  dao.deleteStudent(id);
				  break;
				  
			  case 6:
				  System.out.println("Thank you for using our Application!!");
				  System.exit(0);
				  default:
					  System.out.println("Enter valid choice!!");
					  break;
					  
			  
			  
			  
			  }
		}while(true);
	}

}
