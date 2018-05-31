package com.ts.rest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LanguageDAO {
	public Connection getConncetion() {
		Connection connection = null;
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/demo", "sa","");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}


}
