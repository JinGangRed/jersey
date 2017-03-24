package cn.nuist.chenlong.constant;
/**
 * 存放项目中的变量
 * @author chenlong
 *
 */
public final class Constant {
	//mybatis的资源文件
	public static String Resource = "mybatis-config.xml";
	//包含bean的文件名
	public static String beans = "beans.xml";
	//包含bean的<bean></bean>节点的唯一标示id属性
	public static String bean_id = "id";
	public static String bean_class = "className";
	//项目的访问根路径
	public static String root_path = "http://localhost:8080/ticket";
	//项目访问符合restful风格的路径
	public static String rest_templete_url = "http://localhost:8080/ticket/rest/login/{name}/{pass}";
	
}
