package net.caseStudy.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.caseStudy.registration.model.Employee;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee" + 
				"(id, firstName, middleName, lastName, birthday, position) VALUES " +
				"(?, ?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("come.mysql.jdbc.Driver");
		
		try (Connection connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "password");
				
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getMiddleName());
			preparedStatement.setString(4, employee.getLastName());
			preparedStatement.setString(5, employee.getBirthday());
			preparedStatement.setString(6, employee.getPosition());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
