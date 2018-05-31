package com.ts.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DiscussionDAO {
	

		DAOUtility util = new DAOUtility();
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		String sql;
		int status;
		
		public Discussion save(Discussion discussion) {
			sql = "insert into discussion values(?, ?, ?)";
			try {
				con = util.getConncetion();
				ps = con.prepareStatement(sql);
				ps.setString(1, discussion.getComment());
				ps.setString(2, discussion.getUser_id());
				ps.setString(3, discussion.getPrjct_id());
				status = ps.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			if(status>0) {
				System.out.println("Success");
			}
			
			return discussion;
		}
		

}
