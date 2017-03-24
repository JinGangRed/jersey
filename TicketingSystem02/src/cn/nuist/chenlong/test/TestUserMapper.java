package cn.nuist.chenlong.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.nuist.chenlong.dao.UserDAO;
import cn.nuist.chenlong.pojo.User;
import cn.nuist.chenlong.sql.until.DBUntil;

public class TestUserMapper {
	SqlSession sqlSession = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sqlSession = DBUntil.getDBUntil();
	}

	@After
	public void tearDown() throws Exception {
		sqlSession = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testLogin(){
		UserDAO us = sqlSession.getMapper(UserDAO.class);
		User user = us.login("kingkang", "112");
		System.out.println(user);
	}

}
