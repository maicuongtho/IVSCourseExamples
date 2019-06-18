package jp.ivs.dbexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DbVidu3")
public class DbVidu3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Ten cua driver va dia chi URL cua co so du lieu
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://localhost/ivsTest";

		   //  Ten nguoi dung va mat khau cua co so du lieu
		static final String USER = "thomc";
		static final String PASS = "12345678";
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
		Connection conn = null;
		Statement stmt = null;
		PrintWriter out = response.getWriter();
		try {
	    	// Buoc 2: Dang ky Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Buoc 3: Mo mot ket noi
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);
		    // Buoc 4: Thuc thi truy van
		    stmt = conn.createStatement();
		    
		    String sqlInsert = "insert into appuser (id,name) values (6,'Hoàng Vũ')";
		    stmt.execute(sqlInsert);
		    out.println("Thêm thành công");
		    
		    
		    // Lấy DB ra xem lại
		    String sql = "select * from appuser";
		    ResultSet rs = stmt.executeQuery(sql);
		    // Buoc 5: Lay du lieu tu Result Set, xuất trả cho client
		    String htmlResp="<table>";
		     while(rs.next()){
		   
		         // Lay du lieu boi su dung ten cot
		         int _id= rs.getInt("id");
		         String _name= rs.getString("name");
		         
		     	 htmlResp += "<tr><td>"+_id + "</td><td>"+_name + "</td></tr>";
		     }
			 htmlResp +="</table>";
			 out.print(htmlResp);
		    
		    
		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
