package com.xupt.reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ͨ�������ļ��ͷ���һ��ʹ��
 * ����class.txt���������ļ�
 * 		className
 * 		methoedName
 * @author ��ޱ
 *
 */
public class Test {
	public static void main(String[] args) throws Exception{
	/**
	 * δʹ�÷���ǰ
	 */
		/*Student s = new Student() ;
		s.love();*/
		/*Teacher t = new Teacher() ;
		t.love(); */
		/**
		 * ʹ�÷���
		 */
		//���ؼ�ֵ������
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		//��ȡ����
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		//����
		
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//���÷���
		
		Method m = c.getMethod(methodName) ;
		m.invoke(obj);
		
		
	}

}
