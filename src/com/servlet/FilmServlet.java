package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Film;
import model.FilmType;
import dao.FilmDao;
import dao.FilmTypeDao;

public class FilmServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FilmServlet() {
		super();
	}

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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		FilmDao fDao = new FilmDao();
		//可以通过operType 来响应不同的操作
		String operType = request.getParameter("operType");
		System.out.println(operType);
		//处理获得要修改的记录
		if(operType.equals("edit")){
			System.out.println(operType);
			String id = request.getParameter("film_id");
			Film fi = fDao.getFilmInfoById(id);
			System.out.println(fi.getFilm_id());
			System.out.println(fi.getFilm_actor());
			//获取电影类型
			FilmTypeDao ftDao = new FilmTypeDao();
			List<FilmType> ftList = ftDao.selectAll();
			request.setAttribute("film",fi);
			request.setAttribute("ftList", ftList);
//			
			/**
			 * 将客户端的请求转向（forward）到getRequestDispatcher（）方法中参数定义的页面或者链接
			 */
			request.getRequestDispatcher("showFilms.jsp").forward(request, response);
		}
		//处理列表数据
		if(operType.equals("list")){
			//从数据库获得数据
			List<Film> list = fDao.selectAll();
			 request.setAttribute("list", list);
			 request.getRequestDispatcher("ListFilms.jsp").forward(request, response);
		}
		//处理数据的保存
		if(operType.equals("save")){
			System.out.println("save");
			String type_id = request.getParameter("type_id");
			String film_id = request.getParameter("film_id");
			String film_name = request.getParameter("title");
			String film_actor = request.getParameter("film_actor");
			String film_introduce = request.getParameter("contents");
			Film f = new Film();
			f.setFilm_id(Integer.parseInt(film_id));
			f.setFilm_name(film_name);
			f.setFilm_actor(film_actor);
			f.setFilm_introduction(film_introduce);
			FilmType ft = new FilmType();
			ft.setType_id(Integer.parseInt(type_id));
			f.setFilmType(ft);
			if(fDao.updateFilm(f)>0){
				response.sendRedirect("FilmServlet?operType=list");
			}else{
				request.setAttribute("msg", fDao.msg);
				request.getRequestDispatcher("FilmServlet?operType=edit&film_id="+film_id).forward(request, response);
			}
		}
		if(operType.equals("delete")){
			
		}
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

		doGet(request, response);
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
