package com.sam.springbegin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(int row, String city) {
}

@Configuration // 클래스가 하나 이상의 Bean 메서드를 선언함을 나타낸다. 이곳에서 spring bean을 정의한다.
public class HelloWorldConfigration {

    @Bean // bean을 생성함을 나타내는 어노테이션
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address(20, "New YORK"));
    }

    @Bean(name = "person3")
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "person2")
    public Person person2Method() {
        return new Person(name(), age(), address());
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address(20, "New YORK");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address(180, "Mongol City");
    }

    // 여기서 만드는 빈은 스프링 컨텍스트가 관리한다.

}
