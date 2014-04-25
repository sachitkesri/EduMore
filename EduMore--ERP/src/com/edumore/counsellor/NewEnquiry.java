package com.edumore.counsellor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edumore.admin.AdminLogin;

/**
 * Servlet implementation class NewEnquiry
 */
@WebServlet("/NewEnquiry")
public class NewEnquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewEnquiry() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName = request.getParameter("studentName");
		String studentPhoneNumber = request.getParameter("phoneNumber");
	//	String enquiredCourseId = request.getParameter("courseId");
		request.setAttribute("statusMsg", "Saved Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("addNewEnquiry.jsp");
		rd.forward(request, response);
		
	}

}
