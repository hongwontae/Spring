package com.sam.springbegin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sam.springbegin.game.GameRunner;
import com.sam.springbegin.game.GamingConsol;


@Configuration
@ComponentScan("com.sam.springbegin.game")
public class GamingAppLauncherApplication {



    // @Bean
    // public GameRunner gameRunner(GamingConsol game) {
    //     System.out.println("parameter"+game);
    //     var gameRunner = new GameRunner(game);
    //     return gameRunner;
    // }

    public static void main(String[] args) {

        try (
                var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);)

        {

            context.getBean(GamingConsol.class).up();
            ;
            context.getBean(GameRunner.class).run();

        }

    }
}
