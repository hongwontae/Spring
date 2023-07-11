package com.sam.springbegin.SpringReBack;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{

    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Some Initialization logic");
        this.classA=classA;
    } // class a를 이용해서 초기화를 하고 있다. 

    public void doSomeThing(){
        System.out.println("Do SomeThing it");
    }

}


@Configuration
@ComponentScan
public class initial1 {

    public static void main(String[] args) {

        // 왜 패키지를 옮기면서 try를 사용했나요?
        // 리소스 누출 컨텍스트가 닫힘을 원한다. (다른 패키지에 이 파일을 옮겨서 누출 됐다는 뜻 같다.)
        // try로 묶어서 전달하면 오류 발생하지 않고 정상 작동한다.
        try(        
        // 이 애플리케이션을 실행하면 JVM이 시작되며 SPRING 컨텍스트를 만들어보자.

        // Spring context 실행단계 jvm내에서 스프링 컨텍스트 만들기!!
        var context = new AnnotationConfigApplicationContext(initial1.class)){
            
            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("InitalLization of context is completed");

            context.getBean(ClassB.class).doSomeThing();
            // 사용되기 전에 로드된다.


        }



    }

}
