package com.SpringTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JDBC1insert {
	

	@Test
	public void insert() throws ClassNotFoundException, SQLException {
		
		String name = "1234";
		String password="1234";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true","root","asdfg123");;
//		Statement stm = conn.createStatement();
//		stm.executeUpdate("insert into user(username,password)values('1234','1234')");
		
		PreparedStatement prst = conn.prepareStatement("insert into user (username,password) VALUES (?,?)");
		prst.setString(1, name);
		prst.setString(2, password);
		prst.executeUpdate();	
		System.out.println("成功新增" + "      username:" + name +"      password:" + password );
	}
	
	


}
