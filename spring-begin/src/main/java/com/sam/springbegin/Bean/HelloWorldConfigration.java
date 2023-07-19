package com.sam.springbegin.Bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
}; // 레코드 객체를 가져온다. 레코드는 toString이 있다.

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

    
    @Bean(name = "person")
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person("son", age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address); // 현재 address 빈이 존재하지 않는다.
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address); // 현재 address 빈이 존재하지 않는다.
    }

    @Bean(name = "person2")
    public Person person2Method() {
        return new Person(name(), age(), address());
    }

    @Bean(name = "address2")
    @Primary // 두 개의 같은 이름의 빈이 겹치면 우선순위를 부여하는 어노테이션
    public Address address() {
        return new Address(20, "New YORK");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address(180, "Mongol City");
    }

    // 여기서 만드는 빈은 스프링 컨텍스트가 관리한다.

}
