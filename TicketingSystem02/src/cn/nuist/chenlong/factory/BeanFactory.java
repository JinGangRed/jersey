package cn.nuist.chenlong.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.nuist.chenlong.constant.Constant;
import cn.nuist.chenlong.sql.until.DBUntil;

@SuppressWarnings("all")
public class BeanFactory {
	private static Map<String,Object> objectMaps= new HashMap<String, Object>();
	public static Object getObjectByKey(String key){
		return objectMaps.get(key);
	}
	static{
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(BeanFactory.class.getClassLoader().getResourceAsStream(Constant.beans));
			Element rootElement = document.getRootElement();
			List<Element> list = rootElement.elements();
			for(Element e:list) {
				String key = e.attributeValue(Constant.bean_id);
				Object obj = DBUntil.getDBUntil().getMapper(Class.forName(e.attributeValue(Constant.bean_class)));
				objectMaps.put(key, obj);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
