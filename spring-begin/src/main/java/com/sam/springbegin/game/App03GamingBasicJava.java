package com.sam.springbegin.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {

			context.getBean(GamingConsol.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}