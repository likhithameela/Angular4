package com.ts.dao;

public class Projects {
	private String prjct_id;
	private String prjct_name;
	private String description;
	private String lang_name;
	public Projects() {
		super();
	}
	public Projects(String prjct_id, String prjct_name, String description, String lang_name) {
		super();
		this.prjct_id = prjct_id;
		this.prjct_name = prjct_name;
		this.description = description;
		this.lang_name = lang_name;
	}
	public String getPrjct_id() {
		return prjct_id;
	}
	public void setPrjct_id(String prjct_id) {
		this.prjct_id = prjct_id;
	}
	public String getPrjct_name() {
		return prjct_name;
	}
	public void setPrjct_name(String prjct_name) {
		this.prjct_name = prjct_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLang_name() {
		return lang_name;
	}
	public void setLang_name(String lang_name) {
		this.lang_name = lang_name;
	}
	
	

}
