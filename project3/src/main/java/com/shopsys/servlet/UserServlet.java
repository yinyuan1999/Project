package com.shopsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("op");
		if("login".equals(action)) {
			login(request, response);
		}else {
			response.getWriter().println("暂时不支持此操作");
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String username= request.getParameter("username");
         String password=request.getParameter("password");
       
         if("admin".equals(username) && "123456".equals(password)) {
        	 
        	 response.sendRedirect("admin/index.jsp");
         }else {
        	 PrintWriter out= response.getWriter();
        	 out.println("login no ok");
         }
	}

}
