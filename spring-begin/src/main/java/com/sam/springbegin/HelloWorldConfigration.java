package com.sam.springbegin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(int row, String city){}

@Configuration //클래스가 하나 이상의 Bean 메서드를 선언함을 나타낸다. 이곳에서 spring bean을 정의한다.
public class HelloWorldConfigration {

    @Bean // bean을 생성함을 나타내는 어노테이션
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        
        return new Person("Ravi", 20);
    }

    @Bean
    public Address address(){
        return new Address(20, "New YORK");
    }

    // 여기서 만드는 빈은 스프링 컨텍스트가 관리한다.

    
    
}
