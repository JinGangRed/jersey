package cn.nuist.chenlong.dao;

import org.apache.ibatis.annotations.Param;

import cn.nuist.chenlong.pojo.User;

public interface UserDAO {
	public User login(@Param("name")String name,@Param("pass")String pass);
}
