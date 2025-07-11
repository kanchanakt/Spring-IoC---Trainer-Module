package com.skyllx.ioc.classes;

import org.springframework.stereotype.Component;

import com.skyllx.ioc.interfaces.Trainer;

@Component("jt")
public class JavaTrainer implements Trainer{

	@Override
	public String practice() {
		return "practice complex problem";
	}

}
