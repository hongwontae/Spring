package com.sam.springbegin.dependenciesInjection;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{

    //@Autowired //필드 주입
    Dependency1 dependency1;

    //@Autowired // 필드 주입
    Dependency2 dependency2;

    // @Autowired // setter 주입
    // public void setDependency1(Dependency1 dependency1){
    //     System.out.println("Setter Injection set Dep1");
    //     this.dependency1 = dependency1;
    // }

    // @Autowired // setter 주입
    // public void setDependency2(Dependency2 dependency2){
    //     System.out.println("dependeis2");
    //     this.dependency2=dependency2;
    // }

    

    public String toString(){
        return "Using "+dependency1+" and "+dependency2;
    }

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {



    public static void main(String[] args) {

        try (
                var context = new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class)){

                    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

                    System.out.println(context.getBean(YourBusinessClass.class)); 

                }


    }
}

