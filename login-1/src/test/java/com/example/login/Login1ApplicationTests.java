package com.example.login;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Login1ApplicationTests {

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/sys?characterEncoding=utf8&serverTimezone=UTC";

	private static final String USER ="root";

	private static final String PW = "rootpw";

	

	@Test

	public void testConnection() throws Exception{

		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW))	{

			System.out.println(con);
			System.out.println("야호");

			

		}catch(Exception e){
		System.out.println("오류발생");

			System.err.println(e);

		}

	}

}
