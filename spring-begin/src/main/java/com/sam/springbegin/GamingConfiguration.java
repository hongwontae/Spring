package com.sam.springbegin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sam.springbegin.game.GameRunner;
import com.sam.springbegin.game.GamingConsol;
import com.sam.springbegin.game.PackMan;


@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsol game () {
        var game = new PackMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsol game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    
}
