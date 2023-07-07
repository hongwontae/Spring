package com.sam.springbegin.game;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        
        //var game = new PackMan();
        var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
    // 이를 강한 결합이라고 부른다.
    // 강한 결합은 애플리케이션의 종속성을 증가시켜서 코드 작성의 어려움을 야기한다.
    // var는 추론 타입이다. 나중에 타입이 결정된다. 위의 객체타입이다.

    // 인터페이스를 이용해 main-interface-자바객체를 묶는 것 행위들을 통칭하는 말이 약한 결합이다.
    // 의존성이 약하다.

    // 1. 객체 생성 팩맨
    // 2. gameRunner => 게임을 실행할 수 있어야 한다. game 변수가 필요하다. game이 의존성이다.

    // springFrameWork는 객체를 생성하고 결합하도록 하는 것이 목적이다.
    
}
