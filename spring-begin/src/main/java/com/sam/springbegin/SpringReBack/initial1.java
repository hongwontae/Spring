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

    public void doSomething(){
        System.out.println("init, init");
    }


}


@Configuration
@ComponentScan
public class initial1 {

    public static void main(String[] args) {

        try(        

        var context = new AnnotationConfigApplicationContext(initial1.class)){
            
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("Initialization of context is completed"); // 컨텍스트 내부 먼저 호출된다. 우선순위 1

            context.getBean(ClassB.class).doSomething(); // 빈 호출

        }



    }

}
