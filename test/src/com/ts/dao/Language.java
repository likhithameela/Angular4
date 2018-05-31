package com.ts.dao;

public class Language {
	private String lang_name;
	private String description;
	public Language() {
		super();
	
	}
	public Language(String lang_name, String description) {
		super();
		this.lang_name = lang_name;
		this.description = description;
	}
	public String getLang_name() {
		return lang_name;
	}
	public void setLang_name(String lang_name) {
		this.lang_name = lang_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
