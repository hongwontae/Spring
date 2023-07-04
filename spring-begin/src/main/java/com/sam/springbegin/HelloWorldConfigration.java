package com.sam.springbegin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //클래스가 하나 이상의 Bean 메서드를 선언함을 나타낸다. 이곳에서 spring bean을 정의한다.
public class HelloWorldConfigration {

    @Bean // bean을 생성함을 나타내는 어노테이션
    public String name(){
        return "Ranga";
    }

    // 여기서 만드는 빈은 스프링 컨텍스트가 관리한다.

    
    
}
