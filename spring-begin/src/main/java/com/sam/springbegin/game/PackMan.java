package com.sam.springbegin.game;

import org.springframework.stereotype.Component;

@Component
public class PackMan implements GamingConsol{

    public void up(){
        System.out.println("Jump33-packMan");
    }

      public void down(){
        System.out.println("Go into a hole33");
    }

      public void left(){
        System.out.println("Go back33");
    }

      public void right(){
        System.out.println("Accelerate33");
    }

}
