package com.xupt.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 给一个ArrayList<Integer>对象，在其中加入字符串
 * 使用反射可以实现
 * @author 赵薇
 *
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> array = new ArrayList<>();
		
		Class c = array.getClass() ; //通过反射得到ArrayList的class对象
		
		Method m = c.getMethod("add", Object.class);
		m.invoke(array, "北京");
		m.invoke(array, "上海");
		m.invoke(array, "广州");
		m.invoke(array, "深圳");
		System.out.println(array);
	}

}
