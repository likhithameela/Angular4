package com.ts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ts.dao.Projects;
import com.ts.dao.DAOUtility;

public class ProjectsDAO {

	/*
	 * DAOUtility util = new DAOUtility(); Connection con; PreparedStatement ps;
	 * ResultSet rs; String sql; int status;
	 */

	// public Projects getProjects(String lang_name) {

	public List<Projects> getAllProjects() {
		Projects p;
		List<Projects> projects = new ArrayList();
		// Projects p = new Projects();

		String sql = "select * from projects where lang_name = 'java'";
		try {
			DAOUtility util = new DAOUtility();
			Connection connection = util.getConncetion();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				p = new Projects();
				p.setPrjct_id(rs.getString(1));
				p.setPrjct_name(rs.getString(2));
				p.setDescription(rs.getString(3));
				System.out.println(p);
				projects.add(p);
				System.out.println(p.getLang_name());
				// p.setCity(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(projects);
		return projects;

		// public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		//return null;
	}
	public List<Projects> getAllProjects1() {
		Projects p;
		List<Projects> projects = new ArrayList();
		// Projects p = new Projects();

		String sql = "select * from projects where lang_name = 'python'";
		try {
			DAOUtility util = new DAOUtility();
			Connection connection = util.getConncetion();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				p = new Projects();
				p.setPrjct_id(rs.getString(1));
				p.setPrjct_name(rs.getString(2));
				p.setDescription(rs.getString(3));
				System.out.println(p);
				projects.add(p);
				System.out.println(p.getLang_name());
				// p.setCity(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(projects);
		return projects;

		// public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		//return null;
	}
	public List<Projects> getAllProjects2() {
		Projects p;
		List<Projects> projects = new ArrayList();
		// Projects p = new Projects();

		String sql = "select * from projects where lang_name = 'angular'";
		try {
			DAOUtility util = new DAOUtility();
			Connection connection = util.getConncetion();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				p = new Projects();
				p.setPrjct_id(rs.getString(1));
				p.setPrjct_name(rs.getString(2));
				p.setDescription(rs.getString(3));
				System.out.println(p);
				projects.add(p);
				System.out.println(p.getLang_name());
				// p.setCity(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(projects);
		return projects;

		// public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		//return null;
	}

}