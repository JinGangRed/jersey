package cn.nuist.chenlong.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.nuist.chenlong.dao.UserDAO;
import cn.nuist.chenlong.factory.BeanFactory;

public class TestFactory {
	UserDAO ud = (UserDAO) BeanFactory.getObjectByKey("UserDAO");
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
	public void testUserDao(){
		System.out.println(ud.login("kingkang", "112"));
	}
}
