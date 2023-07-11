package com.sam.springbegin.simpledemocontext;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class RealWorldSpringContextApplication {

    public static void main(String[] args) {

        // 왜 패키지를 옮기면서 try를 사용했나요?
        // 리소스 누출 컨텍스트가 닫힘을 원한다. (다른 패키지에 이 파일을 옮겨서 누출 됐다는 뜻 같다.)
        // try로 묶어서 전달하면 오류 발생하지 않고 정상 작동한다.
        try(        
        // 이 애플리케이션을 실행하면 JVM이 시작되며 SPRING 컨텍스트를 만들어보자.

        // Spring context 실행단계 jvm내에서 스프링 컨텍스트 만들기!!
        var context = new AnnotationConfigApplicationContext
        (RealWorldSpringContextApplication.class);){
            
    
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(Business.class).findMax());

        }



    }

}
