package jp.ivs.dbexample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbVidu
 */
@WebServlet("/DbVidu")
public class DbVidu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //1  Đăng ký Driver để làm việc với MySQL
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		//2 Kết nối
			 String URL ="jdbc:mysql://localhost:3306/ivsTest";
			 String USER = "thomc";
			 String PASS = "12345678";
			 try {
				Connection conn = DriverManager.getConnection(URL, USER, PASS);
				response.getWriter().println("Kết nối thành công");
				
			} catch (SQLException e) {
				response.getWriter().println("Kết nối bị lỗi");
				e.printStackTrace();
			} 
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
