package net.caseStudy.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import net.caseStudy.registration.model.Employee;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee" + 
				"(firstName, middleName, lastName, birthday, position, compensationType, compensationAmount, compensationDescription, compensationDate) VALUES " +
				"(?, ?, ?, ?, ?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/java_case_study?useSSL=false", "application", "JavaCaseStudy1");
				
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getMiddleName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getBirthday());
			preparedStatement.setString(5, employee.getPosition());
			preparedStatement.setString(6, employee.getCompensationType());
			preparedStatement.setString(7, employee.getCompensationAmount());
			preparedStatement.setString(8, employee.getCompensationDescription());
			preparedStatement.setString(9, employee.getCompensationDate());

			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}


