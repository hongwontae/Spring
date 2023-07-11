package com.sam.springbegin.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQulifier")
public class SuperContraGame implements GamingConsol {

        public void up(){
        System.out.println("Jump2");
    }

      public void down(){
        System.out.println("Go into a hole2");
    }

      public void left(){
        System.out.println("Go back2");
    }

      public void right(){
        System.out.println("Accelerate2");
    }

}
