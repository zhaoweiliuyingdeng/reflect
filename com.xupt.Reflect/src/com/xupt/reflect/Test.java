package com.xupt.reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 通过配置文件和反射一起使用
 * 先用class.txt代替配置文件
 * 		className
 * 		methoedName
 * @author 赵薇
 *
 */
public class Test {
	public static void main(String[] args) throws Exception{
	/**
	 * 未使用反射前
	 */
		/*Student s = new Student() ;
		s.love();*/
		/*Teacher t = new Teacher() ;
		t.love(); */
		/**
		 * 使用反射
		 */
		//加载键值对数据
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		//获取数据
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		//反射
		
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//调用方法
		
		Method m = c.getMethod(methodName) ;
		m.invoke(obj);
		
		
	}

}
