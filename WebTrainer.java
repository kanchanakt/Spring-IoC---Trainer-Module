package com.skyllx.ioc.classes;

import org.springframework.stereotype.Component;

import com.skyllx.ioc.interfaces.Trainer;

@Component("wt")
public class WebTrainer implements Trainer {

	@Override
	public String practice() {
		
		return "practice website creation everyday";
	}

}
