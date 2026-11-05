package java_crud_simple_project_using_jdbc_statement.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java_crud_simple_project_using_jdbc_statement.connection.StudentConnection;
import java_crud_simple_project_using_jdbc_statement.dto.StudentDto;


public class StudentDao {
	
	
	
	Connection con=StudentConnection.getStudentConnection();
	
	public int addStudentDetails(StudentDto student) {
		
		String insertQuery="insert into student5 values("+student.getStudentId()+",'"+student.getStudentName()+"')";
		
		
		try {
			Statement statement=con.createStatement();
			
			
			 int id=statement.executeUpdate(insertQuery);
			
			
			if(id>0) {
				System.out.println("Data has been stored");
			}
			else {
				System.out.println("please check your code and SQl Query");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
}

