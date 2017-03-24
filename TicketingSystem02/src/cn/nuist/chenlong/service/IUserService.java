package cn.nuist.chenlong.service;

import cn.nuist.chenlong.dao.UserDAO;
import cn.nuist.chenlong.factory.BeanFactory;
/**
 * 
 * @author chenlong
 *
 */
public interface IUserService {
	public UserDAO userDao = (UserDAO) BeanFactory.getObjectByKey("UserDAO");
	/**
	 * �û���¼
	 * @param userName
	 * @param password
	 * @return
	 */
	public boolean login(String userName,String password);
}
