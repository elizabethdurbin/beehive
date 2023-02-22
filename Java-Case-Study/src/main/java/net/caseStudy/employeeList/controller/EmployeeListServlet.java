package net.caseStudy.employeeList.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.caseStudy.employeeList.dao.EmployeeListDao;
import net.caseStudy.employeeList.model.EmployeeList;
import net.caseStudy.registration.model.Employee;

import java.io.IOException;
import java.util.List;


@WebServlet("/viewEmployees")
public class EmployeeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmployeeListDao employeeListDao = new EmployeeListDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeListServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeDirectory.jsp");
		dispatcher.forward(request, response);
		
		//This is where the app calls the get all employees, this will call when the page switches to 
		//the viewEmployees route (employeeDirectory.jsp) as seen above
		//You can check the Console in Eclipse to see the output from this file
		try {
			List<Employee> allEmployees = employeeListDao.getAllEmployees();
			
			//Here it will loop through all the employee objects of the db and you can access the data from
			//these objects as seen below in the print statements
			for (int i=0; i<allEmployees.size(); i++) {
				System.out.println(allEmployees.get(i).getId());
				System.out.println(allEmployees.get(i).getFirstName());
				System.out.println(allEmployees.get(i).getLastName());
				System.out.println(allEmployees.get(i).getBirthday());
				System.out.println(allEmployees.get(i).getPosition());

			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			employeeListDao.getAllEmployees();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}

		
			


