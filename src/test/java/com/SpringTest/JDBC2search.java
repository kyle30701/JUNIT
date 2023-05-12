package com.SpringTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class JDBC2search {
	
	@Test
	public void select() throws ClassNotFoundException, SQLException {
		String name = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true","root","asdfg123");;
		PreparedStatement  prst = conn.prepareStatement("select * from user where username = ?");
		prst.setString(1, name);
		ResultSet rs = prst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("username") + "," + rs.getString("password"));
			}	
		
	
		
	}


}
