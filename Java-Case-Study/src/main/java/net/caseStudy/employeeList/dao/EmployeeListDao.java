package net.caseStudy.employeeList.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import net.caseStudy.employeeList.model.EmployeeList;
import net.caseStudy.registration.model.Employee;

public class EmployeeListDao {
	
	public List<Employee> getAllEmployees () throws ClassNotFoundException {
		String GET_ALL_EMPLOYEES_SQL = "SELECT * from employee";
		Employee currentemployee = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		ResultSet rs = null;
		
		try (Connection connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/java_case_study?useSSL=false", "application", "JavaCaseStudy1");
				
			PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_EMPLOYEES_SQL)) {
			System.out.println(preparedStatement);
			
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String middleName = rs.getString("middleName");
				String lastName = rs.getString("lastName");
				String birthday = rs.getString("birthday");
				String position = rs.getString("position");
				
				currentemployee = new Employee();
				currentemployee.setId(id);
				currentemployee.setFirstName(firstName);
				currentemployee.setMiddleName(middleName);
				currentemployee.setLastName(lastName);
				currentemployee.setBirthday(birthday);
				currentemployee.setPosition(position);
				
				employeeList.add(currentemployee);
				
				
				
				System.out.println(id + "," + firstName + "," + middleName + "," + lastName + "," + birthday + "," + position);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employeeList;
	}
}


