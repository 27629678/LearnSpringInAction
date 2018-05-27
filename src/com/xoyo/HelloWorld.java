package com.xoyo;

import com.xoyo.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello, world.");

        try {
            // 通过xml进行装配bean
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("knights.xml");
            Knight knight = context.getBean(Knight.class);
            knight.embarkOnQuest();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String sayHello() {
        return "Hello, Bean.";
    }
}
