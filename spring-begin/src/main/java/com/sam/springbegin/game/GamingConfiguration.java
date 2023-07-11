package com.sam.springbegin.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsol game() {
		var game = new PackMan();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsol game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}