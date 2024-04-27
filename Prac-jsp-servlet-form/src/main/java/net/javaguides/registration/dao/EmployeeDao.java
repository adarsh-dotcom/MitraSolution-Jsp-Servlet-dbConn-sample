package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Employee;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException, SQLException
	
	{
		
		String INSERT_USERS_SQL = "INSERT INTO employees (employee_id, first_name, last_name, email, salary, city) VALUES (?, ?, ?, ?, ?, ?,)";
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false","root","Aadi@123");
			
				//create statement 
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		{
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, employee.getEmployee_id());
			preparedStatement.setString(2, employee.getFirst_name());
			preparedStatement.setString(2, employee.getLast_name());
			preparedStatement.setString(2, employee.getEmail());
			preparedStatement.setString(2, employee.getSalary());
			preparedStatement.setString(2, employee.getCity());
			
		
		System.out.println(preparedStatement);
		//Execute the Query
		result = preparedStatement.executeUpdate();
		}catch( Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
