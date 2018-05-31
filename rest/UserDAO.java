package com.ts.rest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ts.rest.UserDAO;
import com.ts.rest.DAOUtility;


public class UserDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	
	public User save(User user) {
		sql = "insert into user values(?, ?)";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUser_id());
			ps.setString(2, user.getPassword());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(status>0) {
			System.out.println("Success");
		}
		
		return user;
	}


}
