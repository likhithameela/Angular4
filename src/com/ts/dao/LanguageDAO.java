package com.ts.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LanguageDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	
	public Language save(Language language) {
		sql = "insert into language values(?, ?)";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setString(1, language.getLang_name());
			ps.setString(2, language.getDescription());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(status>0) {
			System.out.println("Success");
		}
		
		return language;
	}


}
