package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.admin;
import dao.adminDao;
import dao.wddbDao;

public class LoginServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String username=request.getParameter("username");
        String userpwd=request.getParameter("userpwd");
        //使用cookie记住用户
        if(request.getParameter("chkRemember")=="null"){
        	//选择不记住用户名密码
        	Cookie[] cookies=request.getCookies();
        	Cookie cookie = new Cookie("userName",username);    
          	cookie.setMaxAge(0);//将时间设置为0，cookie就会马上失效
          	response.addCookie(cookie);
        }
        else{
            //使用cookie记住用户名和密码
          	 Cookie cookie = new Cookie("userName",username);
          	 cookie.setMaxAge(90);
          	 response.addCookie(cookie);
          	 cookie = new Cookie("userPwd",userpwd);
          	 cookie.setMaxAge(90);
          	 response.addCookie(cookie);
        }
        //管理员部分
            int status;//0用户不存在，1登录成功，2密码错误
            if(request.getParameter("logintype").toString()=="0")
            {
            	adminDao wddb=new adminDao();
            	admin ad=new admin();
            	if(wddb.getAdmin(username)==null){
            		/*
            		 *用户不存在
            		 */
            		 status=0;
            		 request.setAttribute("status", 0);
            		
            	}else if(ad.getAdmin_pwd()==userpwd)
            	{
            		/*
            		 *  登录成功
            		 */
            		 request.setAttribute("status", 1);
            		 
            	}else //密码错误
            	{
            		 request.setAttribute("status", 2);
            	}         	
            }
            if(request.getParameter("logintype").toString()=="1")
            {
            	request.setAttribute("status", 3);
	           
            }
            
            request.getRequestDispatcher("index.jsp").forward(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
