package net.caseStudy.registration.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.caseStudy.registration.dao.EmployeeDao;
import net.caseStudy.registration.model.Employee;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmployeeDao employeeDao = new EmployeeDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeRegister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost1(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String birthday = request.getParameter("birthday");
		String position = request.getParameter("position");
		String compensationType = request.getParameter("compensationType");
		String compensationAmount = request.getParameter("compensationAmount");
		String compensationDescription = request.getParameter("compensationDescription");
		String compensationDate = request.getParameter("compensationDate");

		
		
		Employee Employee = new Employee();
		Employee.setFirstName(firstName);
		Employee.setMiddleName(middleName);
		Employee.setLastName(lastName);
		Employee.setBirthday(birthday);
		Employee.setPosition(position);
		Employee.setCompensationType(compensationType);
		Employee.setCompensationAmount(compensationAmount);
		Employee.setCompensationDescription(compensationDescription);
		Employee.setCompensationDate(compensationDate);

		

		
		try {
			employeeDao.registerEmployee(Employee);

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		dispatcher.forward(request, response);
	}

}

		
			


