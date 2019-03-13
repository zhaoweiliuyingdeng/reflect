package com.xupt.reflect;

import java.lang.reflect.Field;

/**
 * дһ������ ����ָ���Ķ�������Ը�ָ����ֵ
 * public void setProperty(Object obj , String propertyName , Object value);
 * @author ��ޱ
 *
 */
public class Tool {
	public void setProperty(Object obj , String propertyName , Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		//ͨ��Obj����õ�class����
		Class c = obj.getClass();
		//ͨ��class����õ���Ӧ ������
		Field f = c.getDeclaredField(propertyName);
		//ȡ������Ȩ��
		f.setAccessible(true);
		//����������Ը�ֵ
		f.set(obj, value);
	}

}
