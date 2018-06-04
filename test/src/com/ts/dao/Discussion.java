package com.ts.dao;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
 
@XmlRootElement 
public class Discussion{ 
private String user_id; 
private String discussion;
private String lang_name;
public Discussion() { 
    super(); 
} 
public Discussion(String user_id, String discussion, String lang_name) { 
    super(); 
    this.user_id = user_id; 
    this.discussion = discussion;
    this.lang_name = lang_name;
} 
public String getUser_id() { 
    return user_id; 
} 
@XmlElement 
public void setUser_id(String user_id) { 
    this.user_id = user_id; 
} 
public String getDiscussion() { 
    return discussion; 
}
public String getLang_name() { 
    return lang_name; 
} 

@XmlElement 
public void setDiscussion(String discussion) { 
    this.discussion = discussion; 
}
public void setLang_name(String lang_name) { 
    this.lang_name = lang_name; 
} 

@Override 
public String toString() { 
    return "Discussion [user_id=" + user_id + ", discussion=" + discussion + ",lang_name=" + lang_name + "]"; 
} 
} 

