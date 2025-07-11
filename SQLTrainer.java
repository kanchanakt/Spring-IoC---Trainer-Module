package com.skyllx.ioc.classes;

import org.springframework.stereotype.Component;

import com.skyllx.ioc.interfaces.Trainer;

@Component("st")
public class SQLTrainer implements Trainer {

	@Override
	public String practice() {
		
		return "practice queries day";
	}

}
