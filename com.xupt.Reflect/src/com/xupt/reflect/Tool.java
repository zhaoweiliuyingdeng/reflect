package com.xupt.reflect;

import java.lang.reflect.Field;

/**
 * 写一个方法 ，给指定的对象的属性赋指定的值
 * public void setProperty(Object obj , String propertyName , Object value);
 * @author 赵薇
 *
 */
public class Tool {
	public void setProperty(Object obj , String propertyName , Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		//通过Obj对象得到class对象
		Class c = obj.getClass();
		//通过class对象得到对应 的属性
		Field f = c.getDeclaredField(propertyName);
		//取消访问权限
		f.setAccessible(true);
		//给对象的属性赋值
		f.set(obj, value);
	}

}
