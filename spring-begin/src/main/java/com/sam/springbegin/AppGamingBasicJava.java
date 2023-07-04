package com.sam.springbegin;

import com.sam.springbegin.game.GameRunner;
import com.sam.springbegin.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
    
}
