package gargbhoomika.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gargbhoomika.web.dao.TestDao;
import gargbhoomika.web.model.TestClass;
public class getTestDataController extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String cn = request.getParameter("name");
		
	    TestDao dao = new TestDao();
	    TestClass t1 = dao.getTestData(cn);
	    
	    request.setAttribute("namedata", t1);
	    
	    
	    RequestDispatcher rd = request.getRequestDispatcher("showdata.jsp");
	    rd.forward(request, response);
	    
	}
}
