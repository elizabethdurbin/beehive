package net.caseStudy.employeeList.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.caseStudy.employeeList.dao.EmployeeListDao;
import net.caseStudy.registration.model.Employee;

import java.io.IOException;
import java.io.PrintWriter;
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
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeDirectory.jsp");
//		dispatcher.forward(request, response);
		

		
		
        PrintWriter out = response.getWriter();  
        response.setContentType("text/html"); 
        out.println("<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\"\r\n"
        		+ "    pageEncoding=\"UTF-8\"%>\r\n"
        		+ "<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"UTF-8\">\r\n"
        		+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-black.css\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
        		+ "\r\n"
        		+ "<title>Directory</title>\r\n"
        		+ "\r\n"
        		+ "<style>\r\n"
        		+ "html,body,h1,h2,h3,h4,h5,h6 {font-family: \"Roboto\", sans-serif;}\r\n"
        		+ ".w3-sidebar {\r\n"
        		+ "  z-index: 3;\r\n"
        		+ "  width: 250px;\r\n"
        		+ "  top: 43px;\r\n"
        		+ "  bottom: 0;\r\n"
        		+ "  height: inherit;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "footer{\r\n"
        		+ "  background-color: #777;\r\n"
        		+ "  padding: 10px;\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  color: white;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+"table, th, td { \r\n"
        		+"	  border: 1px solid black; \r\n"
        		+"border-collapse: collapse; \r\n"
        		+"	} \r\n"
        		+"tr:nth-child(even){ \r\n"
        		+"	background-color: #cbd1d4 \r\n"
        		+"} \r\n"
        		+"tr:hover{background-color: #e6f2ff; \r\n"
        		+ "</style>\r\n"
        		+ "\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "\r\n"
        		+ "<div class=\"w3-top\">\r\n"
        		+ "	  <div class=\"w3-bar w3-theme w3-top w3-left-align w3-large\">\r\n"
        		+ "	    <div class=\"w3-bar-item w3-theme-l1\">HR System</div>\r\n"
        		+ "	    <a class=\"w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1\" href=\"javascript:void(0)\" onclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></a>\r\n"
        		+ "	    <a href=\"http://localhost:8080/Java-Case-Study/\" class=\"w3-bar-item w3-button w3-theme-l1\">Home</a>\r\n"
        		+ "		\r\n"
        		+ "		\r\n"
        		+ "	\r\n"
        		+ "	  </div>\r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<!-- Navbar -->\r\n"
        		+ "<div class=\"w3-top\">\r\n"
        		+ "  <div class=\"w3-bar w3-theme w3-top w3-left-align w3-large\">\r\n"
        		+ "    <button id=\"openNav\" class=\"w3-button w3-black w3-xlarge w3-bar-item\" onclick=\"w3_open()\">&#9776;</button>\r\n"
        		+ "  	<img src=\"images/logo.png\" class=\"w3-top\" style=\"width:60px;height:auto;\">\r\n"
        		+ "    <a class=\"w3-bar-item w3-button w3-left w3-hide-large w3-hover-white w3-large w3-theme-l1\" href=\"javascript:void(0)\" onclick=\"w3_open()\"><i class=\"fa fa-bars\"></i></a>\r\n"
        		+ "    <a href=\"http://localhost:8080/Java-Case-Study/\" class=\"w3-bar-item w3-button w3-theme-l1\">Home</a>\r\n"
        		+ "	\r\n"
        		+ "  </div>\r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<!-- Sidebar -->\r\n"
        		+ "<div class=\"w3-sidebar w3-bar-block w3-card w3-animate-left\" style=\"display:none\" id=\"mySidebar\">\r\n"
        		+ "  <button class=\"w3-bar-item w3-button w3-large\"\r\n"
        		+ "  onclick=\"w3_close()\">Close &times;</button>\r\n"
        		+ "  \r\n"
        		+ "  <h4 class=\"w3-bar-item\"><b>Menu</b></h4>\r\n"
        		+ "  <a href=\"register\" class=\"w3-bar-item w3-button w3-hover-black\">Register Employee</a>\r\n"
        		+ "  <a href=\"viewEmployees\" class=\"w3-bar-item w3-button w3-hover-black\">Employee Directory</a>\r\n"
        		+ "  \r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<!-- Main content -->\r\n"
        		+ "<div class=\"w3-container\">\r\n"
        		+ "	<h1 class=\"w3-text-blue w3-padding-64\">Employee Directory</h1>\r\n"
        		+ "	  \r\n"
        		+ "	\r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<script>\r\n"
        		+ "function myFunction() {\r\n"
        		+ "	alert(\"text here\");\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "var mySidebar = document.getElementById(\"mySidebar\");\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "// Toggle between showing and hiding the sidebar\r\n"
        		+ "function w3_open() {\r\n"
        		+ "  document.getElementById(\"mySidebar\").style.display = \"block\";\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "// Close the sidebar with the close button\r\n"
        		+ "function w3_close() {\r\n"
        		+ "  document.getElementById(\"mySidebar\").style.display = \"none\";\r\n"
        		+ "}\r\n"
        		+ "</script>     \r\n"
        		+ "\r\n");
        
		//This is where the app calls the get all employees, this will call when the page switches to 
		//the viewEmployees route (employeeDirectory.jsp) as seen above
		//You can check the Console in Eclipse to see the output from this file
		try {
			List<Employee> allEmployees = employeeListDao.getAllEmployees();
			out.println("<font face=\"IBM Plex Sans\" size=\"12\"><table border=1 width=75% height=10% >");
			out.println("<tr>" +
						"<th>ID</th>" + 
						"<th>First Name</th>" +
						"<th>Last Name</th>" +
						"<th>Birthday</th>" +
						"<th>Position</th>" +
						"<th>Compensation Type</th>" +
						"<th>Compensation Amount</th>" +
						"<th>Compensation Description</th>" +
						"<th>Compensation Date</th>" +

						" </tr>");
			
			//Here it will loop through all the employee objects of the db and you can access the data from
			//these objects as seen below in the print statements
			for (int i=0; i<allEmployees.size(); i++) {
				out.println("" +
				"<tr>" +
				"<td>" + allEmployees.get(i).getId() + "</td>" +
				"<td>" + allEmployees.get(i).getFirstName() + "</td>" + 
				"<td>" + allEmployees.get(i).getLastName() + "</td>" + 
				"<td>" + allEmployees.get(i).getBirthday() + "</td>" + 
				"<td>" + allEmployees.get(i).getPosition() + "</td>" + 
				"<td>" + allEmployees.get(i).getCompensationType() + "</td>" + 
				"<td>" + allEmployees.get(i).getCompensationAmount() + "</td>" + 
				"<td>" + allEmployees.get(i).getCompensationDescription() + "</td>" + 
				"<td>" + allEmployees.get(i).getCompensationDate() + "</td>" + 
				"</tr>");
			} 
			out.println("</table>");
		}
		catch (Exception e) {
			out.println("SYSTEM ERROR");
		}
		out.println("</html></body>");
		
        
		
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

		
			


