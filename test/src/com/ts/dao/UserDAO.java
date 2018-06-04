package com.ts.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;

import com.ts.rest.User;

public class UserDAO extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
       
    public boolean addUser(User user) {
    	Boolean status = null;
        String user_id = user.getUser_id();
        String password = user.getPassword();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement ps = null;
        try {
        	
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quest", "root","root");
            String query = "insert into user values (?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getUser_id());
            ps.setString(2, user.getPassword());
            if (ps.executeUpdate() > 0)
            	status = true;
            else 
            	status = false;
            System.out.println(status);
        } catch(Exception e) {
            e.printStackTrace();
        }
    return status;
}
    public boolean validateUser(User user) {
    	Boolean status = null;
        String user_id = user.getUser_id();
        String password = user.getPassword();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement ps = null;
        try {
        	
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quest", "root","root");
            String query = "select user_id,password from user values (?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getUser_id());
            ps.setString(2, user.getPassword());
            if (ps.executeQuery() != null)
            	status = true;
            else 
            	status = false;
            System.out.println(status);
        } catch(Exception e) {
            e.printStackTrace();
        }
    return status;
}
    
    
    
    
    
   

    public UserDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
}
