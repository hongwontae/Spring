package com.sam.springbegin.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //MarioGame game;

    //private SuperContraGame game;
    // 이러면 주소값을 가질 수 있데
    private GamingConsol game;

    public GameRunner(@Qualifier("SuperContraGameQulifier") GamingConsol game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
