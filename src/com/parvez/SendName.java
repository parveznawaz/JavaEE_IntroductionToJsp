package com.parvez;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowName
 */
@WebServlet("/SendName")
public class SendName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Running do get");
		
		String name=request.getParameter("name");		
		request.setAttribute("name", name);
		System.out.println("name is "+name);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Running do post");
		String name=request.getParameter("name");		
		request.setAttribute("name", name);
		System.out.println("name is "+name);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);

		
		//doGet(request, response);
	}

}
