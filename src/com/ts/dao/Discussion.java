package com.ts.dao;

public class Discussion {
	private String comment;
	private String user_id;
	private String prjct_id;
	public Discussion() {
		super();
	}
	public Discussion(String comment, String user_id, String prjct_id) {
		super();
		this.comment = comment;
		this.user_id = user_id;
		this.prjct_id = prjct_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPrjct_id() {
		return prjct_id;
	}
	public void setPrjct_id(String prjct_id) {
		this.prjct_id = prjct_id;
	}
	
	
	

}
