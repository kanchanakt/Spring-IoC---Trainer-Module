package com.skyllx.ioc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skyllx.ioc.config.ConfigClass;
import com.skyllx.ioc.interfaces.Trainer;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(ConfigClass.class);
		Trainer jt =(Trainer) aca.getBean("jt");
		System.out.println(jt.practice());
		
		Trainer wt = (Trainer) aca.getBean("wt");
		System.out.println(wt.practice());
		
		Trainer st = (Trainer) aca.getBean("st");
		System.out.println(st.practice());
		
	}
}
