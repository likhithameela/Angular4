
package com.ts.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET 
    @Path("/hi")
    @Produces("text/plain")
    public String getIt() {
        return "Hi there! Angular REST SERVICES";
    }
    @GET 
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "Hello there! WECCOME TO BVRIT";
    }
    @GET 
    @Path("/getData")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getDat() {
       List<Student> list = new ArrayList<Student>();
    	Student student1=new Student(100,"PASHA");
    	list.add(student1);
    	Student student2=new Student(101,"INDIRA");
    	list.add(student2);
     	return list;
    }
    
    @POST
	@Path("/register1")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addStudent(Student student) throws IOException {
		System.out.println("Hi! save called..."+student.getId()+" "+student.getName());
		return "Success";
	}
}
