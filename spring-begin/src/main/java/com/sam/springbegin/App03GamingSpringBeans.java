package com.sam.springbegin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.springbegin.game.GameRunner;
import com.sam.springbegin.game.GamingConsol;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try(        
            var context =
         new AnnotationConfigApplicationContext(GamingConfiguration.class);)
                 
         {

            context.getBean(GamingConsol.class).up();;
            context.getBean(GameRunner.class).run();

         }
        







    }

    
}
