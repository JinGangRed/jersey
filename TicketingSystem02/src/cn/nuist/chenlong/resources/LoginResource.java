package cn.nuist.chenlong.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import cn.nuist.chenlong.dao.UserDAO;
import cn.nuist.chenlong.service.IUserService;
import cn.nuist.chenlong.service.impl.UserServiceImpl;
import cn.nuist.chenlong.sql.until.DBUntil;

@Path("/login")
public class LoginResource {
	IUserService ius = new UserServiceImpl();
	/**
	 * 连接上带有参数的登录
	 * @param name
	 * @param pass
	 * @return
	 */
	@GET
	@Path("/{name}/{pass}")
	@Produces(MediaType.TEXT_XML)
	public String login(@PathParam("name") String name, @PathParam("pass") String pass) {
		UserDAO us = DBUntil.getDBUntil().getMapper(UserDAO.class);
		return us.login(name, pass).toString();
	}
	/**
	 * Form表单提交并实现页面跳转
	 * @param name
	 * @param pass
	 * @param type
	 * @param response
	 * @param request
	 */
	@POST
	@Path("/checkin")
	public void login(@FormParam("name") String name, @FormParam("pass") String pass, @FormParam("type") String type,
			@Context HttpServletResponse response, @Context HttpServletRequest request) {
		if (ius.login(name, pass)) {
			try {
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
