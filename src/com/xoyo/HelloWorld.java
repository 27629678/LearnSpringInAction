package com.xoyo;

import com.xoyo.knights.Knight;
import com.xoyo.soundsystem.CDPlayerConfig;
import com.xoyo.soundsystem.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = CDPlayerConfig.class)
public class HelloWorld {

    @Autowired
    private CompactDisc cd;

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

        HelloWorld instance = new HelloWorld();
        instance.cd.play();

    }

    public String sayHello() {
        return "Hello, Bean.";
    }
}
