package com.ts.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
private int id;
private String name;
public Student() {
	super();
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
@XmlElement
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
@XmlElement
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
}
