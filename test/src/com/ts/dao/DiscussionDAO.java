package com.ts.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;



public class DiscussionDAO extends HttpServlet {
	public List<Discussion> getAllDiscussion() {
		Discussion d;
		List<Discussion> discussion = new ArrayList();
		// Projects p = new Projects();

		String sql = "select * from discussion where lang_name = 'angular'";
		try {
			DAOUtility util = new DAOUtility();
			Connection connection = util.getConncetion();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				d = new Discussion();
				d.setUser_id(rs.getString(1));
				d.setDiscussion(rs.getString(2));
				d.setLang_name(rs.getString(3));
				System.out.println(d);
				discussion.add(d);
				System.out.println(d.getLang_name());
				// p.setCity(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(discussion);
		return discussion;

		// public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		//return null;
	}

    private static final long serialVersionUID = 1L;
       
    public boolean addDiscussion(Discussion discusion) {
    	Boolean status = false;
        String user_id = discusion.getUser_id();
        String discussion = discusion.getDiscussion();
        String lang_name = discusion.getLang_name();
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement ps = null;
        try {
        	System.out.println("i am in dao----------");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quest", "root","root");
            String query = "insert into discussion values (?,?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, discusion.getUser_id());
            ps.setString(2, discusion.getDiscussion());
            ps.setString(3, discusion.getLang_name());
            if (ps.executeUpdate() > 0)
            	status = true;
           // else 
            //	status = false;
            //System.out.println(status);
        } catch(Exception e) {
            e.printStackTrace();
        }
    return status;
}
    
    public DiscussionDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
}
