package com.SpringTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class JDBC4delete {
	@Test
	public void delete() throws ClassNotFoundException, SQLException {

		String name = "12345";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true","root","asdfg123");
		PreparedStatement prst = conn.prepareStatement("delete from user where username=?");;
			prst.setString(1, name);
			prst.executeUpdate();
			System.out.println("成功刪除");
	}
		
}



