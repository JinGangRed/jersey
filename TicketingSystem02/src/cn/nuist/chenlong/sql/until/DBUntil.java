package cn.nuist.chenlong.sql.until;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.nuist.chenlong.constant.Constant;

public class DBUntil {
	private static SqlSession sqlSession = null;
	private String resource = Constant.Resource;
	private DBUntil(){
		SqlSessionFactory sqlSessionFactory = null;
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * »ñµÃsqlsession
	 * @return
	 */
	public static SqlSession getDBUntil(){
		if (sqlSession == null) {
			new DBUntil();
		}
		return sqlSession;
	}
}
