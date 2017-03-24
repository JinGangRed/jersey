package cn.nuist.chenlong.test;

import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class TestJeseryClient {
	private WebResource resource = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testLogin(){
		resource = Client.create().resource("http://localhost:8080/ticket/rest/login/kingkang/112");
		String result = resource.accept(MediaType.TEXT_XML).get(String.class);
		System.out.println(result);
	}
	@Test 
	public void testLoginPost(){
		Form form = new Form();
		form.add("name", "kingkang");
		form.add("pass", "112");
//		form.add("name", "kingkang");
		resource = Client.create().resource("http://localhost:8080/ticket/rest/login/checkin");
		resource.accept(MediaType.TEXT_XML).post(Form.class);
	}

}
