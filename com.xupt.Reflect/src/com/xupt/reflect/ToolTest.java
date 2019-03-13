package com.xupt.reflect;

public class ToolTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Student1 s = new Student1() ;
		Tool t = new Tool() ;
		t.setProperty(s, "name", "Ð¡ºì");
		t.setProperty(s, "age", 12);
		System.out.println(s);
	}

}
class Student1{
	private String name ;
	private int age ;
	@Override
	public String toString() {
		return name+"--" + age;		
		}
}

