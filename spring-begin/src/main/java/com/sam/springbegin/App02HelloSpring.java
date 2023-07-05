package com.sam.springbegin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {

    public static void main(String[] args) {

        // 이 애플리케이션을 실행하면 JVM이 시작되며 SPRING 컨텍스트를 만들어보자.

        // Spring context 실행단계 jvm내에서 스프링 컨텍스트 만들기!!
        var context = new AnnotationConfigApplicationContext(HelloWorldConfigration.class);

        // Spring Framework가 관리하도록 컨텍스트 빈 객체 가져오기
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));

        
        System.out.println(context.getBean("address3"));
        System.out.println(context.getBean(Address.class));

        // 컨텍스트가 getBean이고 컨텍스트에서 값을 가져올 수 있는 방법 중 빈의 이름을 사용하는 방법

    }

}
