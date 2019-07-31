package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtility {
	private static Connection con;

	public static Connection getJdbcConnection() {
		// 1} load driver
		try {
			Class.forName("com.mysql.jdbc.Driver"); //com.mysql.cj.jdbc.Driver
			// established connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clc", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
