package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//beans.xml파일을 로딩(필요한 객체들을 자동생성)
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
	
		//id가 없으므로 클래스의 타입만 가지고 객체를 가져옴
		TestBean t0 = ctx.getBean(TestBean.class);
		System.out.printf("t0 : %s\n", t0);

		
		ctx.close();
	}	
}
