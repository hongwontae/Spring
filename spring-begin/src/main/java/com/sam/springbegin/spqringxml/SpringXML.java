package com.sam.springbegin.spqringxml;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan
public class SpringXML {

    public static void main(String[] args) {

        try(        

        var context = new AnnotationConfigApplicationContext( SpringXML.class)){
            
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



        }



    }

}
