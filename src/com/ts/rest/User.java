package com.ts.rest;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
 
@XmlRootElement 
public class User { 
private String user_id; 
private String password; 
public User() { 
    super(); 
} 
public User(String user_id, String password) { 
    super(); 
    this.user_id = user_id; 
    this.password = password; 
} 
public String getUser_id() { 
    return user_id; 
} 
@XmlElement 
public void setUser_id(String user_id) { 
    this.user_id = user_id; 
} 
public String getPassword() { 
    return password; 
} 
@XmlElement 
public void setPassword(String password) { 
    this.password = password; 
} 
@Override 
public String toString() { 
    return "User [user_id=" + user_id + ", password=" + password + "]"; 
} 
} 

