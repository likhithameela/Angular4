package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ProjectsDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	
	public Projects save(Projects projects) {
		sql = "insert into projects values(?, ?, ?, ?)";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setString(1, projects.getPrjct_id());
			ps.setString(2, projects.getPrjct_name());
			ps.setString(3, projects.getDescription());
			ps.setString(4, projects.getLang_name());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(status>0) {
			System.out.println("Success");
		}
		
		return projects;
	}


}
