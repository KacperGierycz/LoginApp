package Login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Login.service.LoginService;
import dto.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId, password;
		
		System.out.println("post");
		
		userId=request.getParameter("userId");
		password=request.getParameter("password");
		
		
		LoginService loginService=new LoginService();
		boolean result= loginService.authenticate(userId, password);
		
		if (result){
			User user= loginService.getUserDetails(userId);
		// 	request.getSession().setAttribute("user", user);
			request.setAttribute("user",user);
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		//	System.out.println("true");
		//	response.sendRedirect("success.jsp");
			return;
		}
		else {
			System.out.println("false");
			response.sendRedirect("login.jsp");
			
		}
		
	}

}
