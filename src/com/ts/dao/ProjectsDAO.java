package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ts.dao.Projects;
import com.ts.dao.DAOUtility;

public class ProjectsDAO {
	
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	public Projects getProjects(String lang_name) {
		Projects p = new Projects();
		sql = "select * from projects where lang_name = java";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setString(1, lang_name);
			rs = ps.executeQuery();
			if(rs.next()) {
				p.setPrjct_id(rs.getString(1));
				p.setPrjct_name(rs.getString(2));
				p.setDescription(rs.getString(3));
				//p.setCity(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}
}