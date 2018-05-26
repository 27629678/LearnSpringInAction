package com.xoyo;

import com.xoyo.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello, world.");

        // 通过xml进行装配bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }

    public String sayHello() {
        return "Hello, Bean.";
    }
}
