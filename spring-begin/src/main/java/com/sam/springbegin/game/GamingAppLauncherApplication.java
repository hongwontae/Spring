package com.sam.springbegin.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {
	 
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsol.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}