package com.test;
/**
 * 
 * @author HuangYunHe
 * @version 创建时间：2018年6月13日 上午6:38:31
 */
public class Test {
	public static void main(String[] args) {
		City a = new City(1, "张三");
		City b = new City(1, "张三");
		boolean c = a.equals(b);
		System.out.println(c);
	}
}
