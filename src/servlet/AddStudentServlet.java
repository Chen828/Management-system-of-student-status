package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.StudentCRUD;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/servlet/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String age=request.getParameter("age");
		String birthday=request.getParameter("birthday");
		String className=request.getParameter("classname");
		int ret=StudentCRUD.addStudent(id, name, sex, Integer.valueOf(age), birthday, className);
		
		PrintWriter pw=response.getWriter();
		pw.println("<!DOCTYPE html><html><head><meta charset='utf-8'><title>添加学生</title></head>");
		pw.println("<body>");
		if(ret==1)
			pw.println("添加成功</br>");
		else
			pw.println("添加失败</br>");
		pw.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
