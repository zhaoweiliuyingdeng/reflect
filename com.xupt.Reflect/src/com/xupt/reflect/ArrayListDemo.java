package com.xupt.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * ��һ��ArrayList<Integer>���������м����ַ���
 * ʹ�÷������ʵ��
 * @author ��ޱ
 *
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> array = new ArrayList<>();
		
		Class c = array.getClass() ; //ͨ������õ�ArrayList��class����
		
		Method m = c.getMethod("add", Object.class);
		m.invoke(array, "����");
		m.invoke(array, "�Ϻ�");
		m.invoke(array, "����");
		m.invoke(array, "����");
		System.out.println(array);
	}

}
