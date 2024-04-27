package net.javaguides.registration.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.javaguides.registration.dao.EmployeeDao;
import net.javaguides.registration.model.Employee;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/employeeregister")
public class EmployeeServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;
	
	public EmployeeDao employeeDao = new EmployeeDao();
	
	

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String employee_id = request.getParameter("employee_id");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String salary = request.getParameter("salary");
		String city = request.getParameter("city");
		
		Employee employee = new Employee();
		employee.setEmployee_id(employee_id);
		employee.setFirst_name(first_name);
		employee.setLast_name(last_name);
		employee.setEmail(email);
		employee.setSalary(salary);
		employee.setCity(city);
		
		try {
			employeeDao.registerEmployee(employee);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("");
		
		
		
		
		
	}

}
