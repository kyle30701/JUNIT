package com.SpringTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class JDBC3update {
	
	@Test
	public void delete() throws ClassNotFoundException, SQLException {

		String name = "1234";
		String newname="12345";
		String newpassword="1111";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true","root","asdfg123");
		PreparedStatement prst = conn.prepareStatement("UPDATE user SET username = ?,password = ? WHERE username= ?");

			prst.setString(1, newname);
			prst.setString(2, newpassword);
			prst.setString(3, name);
			prst.executeUpdate();
			System.out.println("成功更新");
	}

}
