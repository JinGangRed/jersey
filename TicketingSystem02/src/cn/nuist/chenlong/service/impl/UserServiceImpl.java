package cn.nuist.chenlong.service.impl;

import cn.nuist.chenlong.pojo.User;
import cn.nuist.chenlong.service.IUserService;

public class UserServiceImpl implements IUserService {
	/**
	 * ÓÃ»§µÇÂ¼
	 */
	@Override
	public boolean login(String userName, String password) {
		User user = userDao.login(userName, password);
		if(user!=null){
			return true;
		}
		return false;
	}

}
