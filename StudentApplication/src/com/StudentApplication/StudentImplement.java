package com.StudentApplication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class StudentImplement implements StudentInterface{
	Connection con;
	@Override
	public void createStudent(Student stu) {
		// TODO Auto-generated method stub
		//first to get the connection to our database we have our db connection class so call it
		con=DBConnection.createDBConnection();
		String query="insert into student values(?,?,?,?);";
		try {
		PreparedStatement pstm=con.prepareStatement(query);
		pstm.setInt(1, stu.getId());
		pstm.setString(2, stu.getName());
		pstm.setDouble(3, stu.getGrade());
		pstm.setInt(4, stu.getAge());
		int cnt=pstm.executeUpdate();
		if(cnt!=0)
			System.out.println("Student Registered Successfully!!!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		}

	@Override
	public void showAllStudent() {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="select * from student";
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			System.out.println("ID\tNAME\tGRADE\tAGE");
			System.out.println("_____________________________");
			while(result.next()) {
				
				System.out.format("%d\t%s\t%d\t%d\n",result.getInt(1),result.getString(2),result.getInt(3),result.getInt(4));
				System.out.println("------------------------------");
			}//if we have anything in this result the loop will execute
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void showStudentBasedOnID(int id) {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="select * from student where id="+id;
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			System.out.println("ID\tNAME\tGRADE\tAGE");
			System.out.println("_____________________________");
while(result.next()) {
	
				System.out.format("%d\t%s\t%d\t%d\n",result.getInt(1),result.getString(2),result.getInt(3),result.getInt(4));
				System.out.println("------------------------------");
}//if we have anything in this result the loop will execute
		}
			
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void updateStudent(int id, String name) {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="update student set name=? where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1,name);
			pstm.setInt(2, id);
		int cnt=pstm.executeUpdate();
		if(cnt!=0)
			System.out.println("Student Updated Successfully !!");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		con=DBConnection.createDBConnection();
		String query="delete from student where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, id);
		int cnt=pstm.executeUpdate();
		if(cnt!=0)
			System.out.println("Successfully deleted");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
