package com.ts.rest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.ts.dao.Discussion;
import com.ts.dao.DiscussionDAO;
import com.ts.dao.Projects;
import com.ts.dao.ProjectsDAO;
import com.ts.dao.UserDAO;

/**
 * Example resource class hosted at the URI path "/myresource"
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
	public String hai() {
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
		Student student1 = new Student(100, "PASHA");
		list.add(student1);
		Student student2 = new Student(101, "INDIRA");
		list.add(student2);
		return list;
	}

	// @POST
	// @Path("/register1")
	// @Consumes(MediaType.APPLICATION_JSON)
	// public String addStudent(Student student) throws IOException {
	// System.out.println("Hi! save called..."+student.getId()+"
	// "+student.getName());
	// return "Success";
	// }
	@POST
	@Path("/register1")
	// @Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public void addMember(User user) throws IOException {
		System.out.println("Inside Registration...");
		UserDAO usr = new UserDAO();
		usr.addUser(user);
		/*
		 * if (usr.addUser(user)) { System.out.println("Successfully Inserted\n"
		 * ); System.out.println(user.getUser_id()); return
		 * "Successfully Inserted"; } else { System.out.println("Not Inserted\n"
		 * ); return "Not Interested"; }
		 */

	}

	@GET
	@Path("/javadetails")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Projects> getData() throws ClassNotFoundException, SQLException {
		System.out.println("hi in dao");
		ProjectsDAO projects_dao = new ProjectsDAO();
		List<Projects> list = new ArrayList<Projects>();
		list = projects_dao.getAllProjects();
		System.out.println(list);
		return list;
		// return BuyMobilesBo.getAllMobilesFromDb(@RequestParam String brand,
		// @RequestParam double minPrice , @RequestParam double maxPrice );
	}

	@GET
	@Path("/pythondetails")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Projects> getData1() throws ClassNotFoundException, SQLException {
		System.out.println("hi in dao");
		ProjectsDAO projects_dao = new ProjectsDAO();
		List<Projects> list1 = new ArrayList<Projects>();
		list1 = projects_dao.getAllProjects1();
		System.out.println(list1);
		return list1;
		// return BuyMobilesBo.getAllMobilesFromDb(@RequestParam String brand,
		// @RequestParam double minPrice , @RequestParam double maxPrice );
	}

	@GET
	@Path("/angulardetails")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Projects> getData2() throws ClassNotFoundException, SQLException {
		System.out.println("hi in dao");
		ProjectsDAO projects_dao = new ProjectsDAO();
		List<Projects> list2 = new ArrayList<Projects>();
		list2 = projects_dao.getAllProjects2();
		System.out.println(list2);
		return list2;
		// return BuyMobilesBo.getAllMobilesFromDb(@RequestParam String brand,
		// @RequestParam double minPrice , @RequestParam double maxPrice );
	}

	/*
	 * @GET
	 * 
	 * @Path("projectdetails/{lang_name}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public void
	 * find(@PathParam("lang_name") String lang_name){
	 * System.out.println("Called" +lang_name); }
	 */
	@POST
    @Path("/discussion")
  // @Produces(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public void addDiscussion(Discussion discussion) throws IOException {
    	  System.out.println("Inside Registration...");
    	 DiscussionDAO usr = new DiscussionDAO();
    	 usr.addDiscussion(discussion);
             /*           if (usr.addDiscusion(discussion)) {
                System.out.println("Successfully Inserted\n");
                System.out.println(discussion.getUser_id());
                return "Successfully Inserted";
            } else {
                System.out.println("Not Inserted\n");
                return "Not Interested";
            } */ 
	} 
    	 @GET
    	    @Path("/discussionforum")
    	    @Produces(MediaType.APPLICATION_JSON)
    	    public List<Discussion> getForum() throws ClassNotFoundException, SQLException {
    	    	 System.out.println("hi in dao");
    	    	DiscussionDAO discussion_dao = new DiscussionDAO(); 
    	    	List<Discussion> list = new ArrayList<Discussion>();
    	    	list = discussion_dao.getAllDiscussion();
    	    	System.out.println(list);
    	    	return list;
    	    	//return BuyMobilesBo.getAllMobilesFromDb(@RequestParam String brand, @RequestParam double minPrice , @RequestParam double maxPrice );
    	    }

}
